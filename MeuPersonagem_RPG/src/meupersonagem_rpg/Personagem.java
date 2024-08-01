/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meupersonagem_rpg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class Personagem {
    private String nome;
    private int nivel;
    protected String caracteristicaNivel;
    private int classeArmadura;
    private int pontosVida;
    protected String spellSlot;

    // Getters
    public String getNome() {
        return nome;
    }
    public int getNivel() {
        return nivel;
    }
    public String getCaracteristicaNivel() {
        return caracteristicaNivel;
    }
    public int getClasseArmadura() {
        return classeArmadura;
    }
    public int getPontosVida() {
        return pontosVida;
    }
    public String getSpellSlot() {
        return spellSlot;
    }

    // Setters
    public void setNome(String n) {
        this.nome = n;
    }
    public void setNivel(int nv) {
        this.nivel = nv;
    }
    public void setCaracteristicaNivel(String cni) {
        this.caracteristicaNivel = cni;
    }
    public void setClasseArmadura(int ca) {
        this.classeArmadura = ca;
    }
    public void setPontosVida(int pv) {
        this.pontosVida = pv;
    }
    public void setSpellSlot(String sp) {
        this.spellSlot = sp;
    }

    /*public String detalhesPersonagem() {
        return "\nInfo geral do seu personagem: " + "\nNome: " + nome + "\nNível do personagem: " + nivel 
                + "\nCA: " + classeArmadura + "\nPV: " + pontosVida;
    } */

    
    public String detalhesPersonagem() {
        return "Informações do seu Personagem" + "\nNome: " + nome + "\nNível: " + nivel + "\nCaracteristicas do Nível: " + caracteristicaNivel + "Classe da Armadura: " + classeArmadura + "\nPontos de Vida: " + pontosVida + "\nSpell Slot: " + spellSlot;
    }
    
    
    
    // Método para salvar o personagem no banco de dados
    public void salvarPersonagem() {
        String sql = "INSERT INTO personagens (nome, nivel, caracteristicaNivel, classeArmadura, pontosVida, spellSlot) VALUES (?, ?, ?, ?, ?, ?)";
             // String sql = "select * from ";

       try (Connection conn = Conexao.getConexao(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, getNome());
            pstmt.setInt(2, getNivel());
            pstmt.setString(3, getCaracteristicaNivel());
            pstmt.setInt(4, getClasseArmadura());
            pstmt.setInt(5, getPontosVida());
            pstmt.setString(6, getSpellSlot());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monster;

/**
 *
 * @author Luis
 */
public class Monster {
    // Declaração de variáveis privadas para armazenar as propriedades de um sabor
   // private String monster;
    private String sabor;
    private double valor;
    private String escolher;

    public void status(){
        System.out.println("Você escolheu: " + this.getsabor() + "\nValor: R$" + this.getvalor());
    }
    
    public String getEscolher() {
        return escolher;
    }

    public void setEscolher(String escolher) {
        this.escolher = escolher;
    }
    
    // Construtor da classe monster
    public Monster(String s, double v){ 
    // Inicialização das variáveis com os valores passados para o construtor
       // this.monster = m;
        this.sabor = s;
        this.valor = v;
    }
    
     // Métodos getter para obter os valores das variáveis
     public String getsabor(){
         return sabor;
    }
     public double getvalor(){
         return valor;                                                                                                                                                  
     }
     
    // Métodos setter para definir os valores das variáveis
     public void setsabor(String s){
         this.sabor = s;
     }
     public void setvalor(double v){
         this.valor = v;
     }

}

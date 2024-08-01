package com.mycompany.aula05;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(5000);
        p1.setDono("Luis");
        //p1.setTipo("CC");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(100);
        p1.fecharConta();
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(22222);
        p2.setDono("Andresa");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(200);
        p2.estadoAtual();
    }
}

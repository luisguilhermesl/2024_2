package com.mycompany.canetaazul;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Caneta {
    String marca;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    

    void estado() {
        System.out.println("\nInformações da Caneta:");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.print("Ela está tampada?\n" + (this.tampada ? "Sim" : "Não"));
    }

    void escrever() {
        if (this.tampada) {
            System.out.println("Está tampada! Não posso escrever!\n");
        } else {
            System.out.println("Está destampada! Agora posso escrever!\n");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
    
    boolean perguntarTampada() {
        Scanner teclado2 = new Scanner(System.in);
        System.out.print("A caneta está tampada? (Sim/Não): ");
        String resposta = teclado2.nextLine().toLowerCase(); // Leitura da resposta em minúsculas

        if (resposta.equals("sim")) {
            return true;
        } else if (resposta.equals("não") || resposta.equals("nao")) {
            return false;
        } else {
            System.out.println("Resposta inválida. Por favor, digite 'Sim' ou 'Não'.");
            return perguntarTampada(); // Chama novamente se a resposta for inválida
        }
    }
}

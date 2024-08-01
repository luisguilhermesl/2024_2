package com.mycompany.canetaazul;

import java.util.Scanner;

/**
 * * @author Luis
 */
public class CanetaAzul {

    public static void main(String[] args) {
       
       Scanner teclado1 = new Scanner(System.in); // Crie um objeto Scanner
       Scanner teclado2 = new Scanner(System.in); // Crie um objeto Scanner
      // Scanner teclado3 = new Scanner(System.in); // Crie um objeto Scanner
       
        System.out.print("Digite a marca da primeira caneta: ");
        String marcaC1 = teclado1.nextLine(); // Leia a marca da segunda caneta
        System.out.print("Digite a cor da primeira caneta: ");
        String corC1 = teclado1.nextLine(); // Leia a cor da segunda caneta
        System.out.print("Digite a espessura da primeira caneta : ");
        Double pontaC1 = teclado2.nextDouble(); // Leia a cor da segunda caneta
        System.out.print("Digite a carga da primeira caneta : ");
        int cargaC1 = teclado2.nextInt(); // Leia a cor da segunda caneta
       
        
        Caneta c1 = new Caneta(); // Crie uma instância da classe Caneta
        
        // Atribua os valores lidos à instância c1
        c1.marca = marcaC1; // Atribua a marca lida
        c1.cor = corC1;
        c1.ponta = pontaC1;
        c1.carga = cargaC1;
       
         // Pergunte se a caneta está tampada
        boolean respostaTampada = c1.perguntarTampada(); // Pergunta ao usuário
        c1.tampada = respostaTampada;

        // Exiba as informações da caneta
        c1.estado();
        c1.escrever();
        
      //  c1.destampar();
/*
        System.out.print("Digite a marca da segunda caneta: ");
        String marcaC2 = teclado1.nextLine(); // Leia a marca da segunda caneta
        System.out.print("Digite a cor da segunda caneta: ");
        String corC2 = teclado1.nextLine(); // Leia a cor da segunda caneta

        Caneta c2 = new Caneta();
        c2.marca = marcaC2; // Atribua a marca lida
        c2.cor = corC2; // Atribua a cor lida
        c2.destampar();
        c2.estado();
        c2.escrever();
*/
        teclado1.close(); // Feche o Scanner
        teclado2.close();
    }

   
}

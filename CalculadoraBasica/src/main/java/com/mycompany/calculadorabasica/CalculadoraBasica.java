
package com.mycompany.calculadorabasica;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        
        String nome = "maria";
        int idade = 20;
        double renda = 45.21486;
        
        Scanner scanner = new Scanner(System.in);

       // System.out.print(nome + " tem " + idade + " e ganha R$" + %.2f + "reais");
        System.out.printf(" %s tem %d e ganha R$%.02f reais", nome, idade, renda);
        
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("A soma dos números é: " + resultado);

        scanner.close();
    }
}
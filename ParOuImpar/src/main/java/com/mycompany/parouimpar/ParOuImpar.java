package com.mycompany.parouimpar;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }
}

/*Neste programa, usamos a classe Scanner para receber a entrada do usuário. 
Em seguida, verificamos se o número inserido é par ou ímpar usando o operador 
de módulo (%). Se o resto da divisão do número por 2 for zero, então o número 
é par; caso contrário, é ímpar. O programa então imprime a mensagem correspondente.*/
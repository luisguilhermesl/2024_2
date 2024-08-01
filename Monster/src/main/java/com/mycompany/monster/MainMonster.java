/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.monster;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class MainMonster {

    public static void main(String[] args) {
          // Criação de um objeto Scanner para ler a entrada do usuário
       /*  Scanner sc = new Scanner (System.in);
         
        // Imprime os sabores disponíveis
         System.out.println("Temos Monster dos sabores: \n1=Mango louco\n2=Ultra violet\n3=Absolutely zero\n4=Original");
         
        // Solicita ao usuário que escolha um sabor
         System.out.println("Digite o Sabor que você quer com o numero: ");
         
        // Lê a escolha do usuário
         int escolha = sc.nextInt();*/
         
         Monster m[] = new Monster[4];
         
         m[0] = new Monster("Mango louco", 9.80);
         m[1] = new Monster("Ultra violet", 11.20);
         m[2] = new Monster("Absolutely zero", 9.99);
         m[3] = new Monster("Original", 8.00);
         /*  // Criação de um objeto para cada sabor
         Monster mangoLouco = new Monster("Mango louco", 9.80);
         Monster ultraViolet = new Monster("Ultra violet", 11.20);
         Monster absolutelyZero = new Monster("Absolutely zero", 9.99);
         Monster original = new Monster("Original", 8.00);*/
         
        // Declaração de um objeto monster para armazenar a escolha do usuário
        // Monster escolhido;
         m[3].status();
        // Verifica a escolha do usuário e atribui o objeto monster correspondente a 'escolhido'
        /*   switch(escolha) {
        case 1:
        escolhido = mangoLouco;
        break;
        case 2:
        escolhido = ultraViolet;
        break;
        case 3:
        escolhido = absolutelyZero;
        break;
        case 4:
        escolhido = original;
        break;
        default:
        // Se a escolha do usuário não for válida, imprime uma mensagem de erro e termina o programa
        System.out.println("Opção inválida.");
        return;
        }*/
         // Imprime o sabor escolhido pelo usuário
       //  System.out.println("Você escolheu: " + escolhido.getsabor() + "\nValor: R$" + escolhido.getvalor());

    }
}

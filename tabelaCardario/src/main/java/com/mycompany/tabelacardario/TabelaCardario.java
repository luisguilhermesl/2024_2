/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a 
quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Dica:
if (codigo == 1) {
	total = quantidade * 4.0;
}

*/
package com.mycompany.tabelacardario;
import java.util.Scanner;

public class TabelaCardario {

	public static void main(String[] args) {

            System.out.println("MENU:\n Selecione o código do seu pedido:\n");
            System.out.println("CODIGO |  ESPECIFICAÇÃO  |  PREÇO ");
            System.out.println("  1    | Cachorro Quente |  R$4.00 ");
            System.out.println("  2    |     X-Salada    |  R$4.50 ");
            System.out.println("  3    |     X-Bacon     |  R$5.00 ");
            System.out.println("  4    | Torrada simples |  R$2.00 ");
            System.out.println("  5    |   Refrigerante  |  R$3.00 ");
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("\nDigite aqui o código do seu pedido:");
            int codigo = sc.nextInt();
            System.out.print("\nDigite aqui a quantidade:");
            int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}



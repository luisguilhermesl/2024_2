
package com.mycompany.metodos1;

public class Metodos1 {
    public static void main(String[] args) {
        int numero = 7;

        imprimirTabuada(numero);
    }

    public static void imprimirTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
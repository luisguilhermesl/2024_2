package com.mycompany.atravessarrua;
import java.util.Scanner; /*Aqui, a classe Scanner é importada para permitir a 
                            leitura de entrada do usuário.*/


public class AtravessarRua { //Isso define uma classe chamada AtravessarRua

    public static void main(String[] args) { /* Este é o método principal (main) que é 
                                               executado quando o programa é iniciado. 
                                               Ele recebe um array de strings como argumento.*/

       Scanner teclado = new Scanner (System.in); /*Um objeto Scanner é criado para ler a 
                                                    entrada do usuário a partir do console.*/
       
       System.out.println("Atrevessar a Rua \nOlhar para a esquerda \nOlhar para a direita"); /*Imprime no console a mensagem "Atravessar a Rua", 
                                                                                                "Olhar para a esquerda" e "Olhar para a direita"*/
        System.out.println("Está vindo carro? Digite 'S' para Sim e 'N' para não:"); /*imprime na tela se o carro está vindo ou não e pede para
                                                                                    o usuário digitar entre 's' ou 'n'*/
        String resposta = teclado.nextLine(); //Lê a linha digitada pelo usuário e armazena na variável resposta como uma string.

        if (resposta.equals("n")){ //Verifica se a resposta é igual a "n" (ou seja, o usuário não vê carros vindo).
            System.out.println("Posso Atravessar"); //escrevendo na tela que posso atravessar
        }else{ //Caso contrário, se a resposta do usuário for qualquer outra coisa (carros vindo)
            System.out.println("Não posso atravessar");
            
        }
    }
}

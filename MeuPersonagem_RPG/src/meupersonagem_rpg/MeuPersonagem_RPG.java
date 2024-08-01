package meupersonagem_rpg;

import java.util.Scanner;

public class MeuPersonagem_RPG {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("ESCOLHA SEU PERSONAGEM:\n"
                + "\n"
                + "MAGO\n"
                + "FEITICEIRO\n"
                + "GUERREIRO\n"
                + "BÁRBARO\n"
                + "CLÉRIGO\n"
                + "PALADINO");

        String ClasseEscolha = sc.nextLine();
        char[] ClasseEscolhaToCharArray = ClasseEscolha.toLowerCase().toCharArray();
        String acento = "";
        for (int i = 0; i < ClasseEscolhaToCharArray.length; i++){
            char nome = ClasseEscolhaToCharArray[i];
            switch (nome){
                case 'á', 'à', 'ã' -> nome = 'a';
                case 'é', 'ê' -> nome = 'e';
                case 'ó', 'ô' -> nome = 'o';
                case 'í' -> nome = 'i';
                case 'ú' -> nome = 'u';
            }
            acento += nome;
        }

        Personagem personagem = null;
        
        switch (acento) {
            case "mago":
                personagem = new ClasseMago();
                break;
           /* case "feiticeiro":
                personagem = new ClasseFeiticeiro();
                break;
            case "guerreiro":
                personagem = new ClasseGuerreiro();
                break;
            case "barbaro":
                personagem = new ClasseBarbaro();
                break;
            case "clerigo":
                personagem = new ClasseClerigo();
                break;
            case "paladino":
                personagem = new ClassePaladino();
                break;*/
        }
        
        if (personagem != null) {
            System.out.print("\nQual o nome do seu personagem? ");
            personagem.setNome(sc.nextLine());
            System.out.print("Qual seu nivel? (1 a 5) ");
            personagem.setNivel(sc2.nextInt());
            System.out.print("Agora acrescente seus pontos de vida: ");
            personagem.setPontosVida(sc2.nextInt());
            personagem.salvarPersonagem();
            System.out.print(personagem.detalhesPersonagem());
        }
    }
}

package for_each;
import java.util.Scanner;

/**
 *Utilize “for-each" para contar o número de vogais em uma string fornecida pelo usuário.
 * 
 * @author Luis
 */
public class numDeVogais {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String frase = teclado.nextLine().toLowerCase(); //Converte para minúsculo
        int contadorVogais = 0;
        
        for(char letra : frase.toCharArray()){
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contadorVogais++;
            }
        }
        System.out.println("A frase contém " + contadorVogais + "vogais." );
        teclado.close();
    }
}

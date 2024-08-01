
package while_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Vini
 */
public class While_lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        int opcao = 0;
        //String nome = "", endereco = "";
        //String[] clientes = new String[5];
        //String[] enderecos = new String[5];
        List<String> clientes = new ArrayList<>();
        List<String> enderecos = new ArrayList<>();
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Cadastrar Clientes");
            System.out.println("2. Mostrar Clientes cadastrados");
            System.out.println("3. Sair");
            System.out.print("Digite sua opção: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    String nome,
                     endereco;
                    System.out.println("Digite o nome do cliente: ");
                    nome = teclado2.nextLine();
                    System.out.println("Digite o endereço do cliente: ");
                    endereco = teclado2.nextLine();
                    clientes.add(nome);
                    enderecos.add(endereco);
                    break;
                case 2:
                    if (clientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (int i = 0; i < clientes.size(); i++) {
                            System.out.printf("\nCliente Cadastrado: " + clientes.get(i) + "\nEndereço: " + enderecos.get(i) + "\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

    }

}

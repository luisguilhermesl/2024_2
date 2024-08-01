package esfolha;

/**
 *
 * @author Luis
 */
public class Personagem {
    protected int ataque;
    protected int stamina;
    protected int vida;
    protected int defesa;

    public void exibirAtributos() {
        System.out.println("Ataque: " + ataque);
        System.out.println("Stamina: " + stamina);
        System.out.println("Vida: " + vida);
        System.out.println("Defesa: " + defesa);
    }
}
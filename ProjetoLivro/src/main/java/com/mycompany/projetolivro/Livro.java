package com.mycompany.projetolivro;
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() { //Insert Code > toString
        return "Livro{" + "titulo=" + titulo + ", \nautor=" + autor + ", \ntotalPaginas=" + totalPaginas + ", \npagAtual=" + pagAtual + ", \naberto=" + aberto + ", \nleitor=" + leitor.getNome() + ",\n idade = " + leitor.getIdade() + ",\n sexo = " + leitor.getSexo()+ '}';
    }
    
    /*
    O método toString() é um método especial em Java que retorna uma string que “representa” o objeto. 
    É muito útil para depuração e registro de informações. Quando você tenta imprimir um objeto, 
    Java automaticamente chama o método toString() desse objeto.

    No código que você compartilhou, o método detalhes() parece estar agindo como um método toString(). 
    Ele está retornando uma string que representa um objeto Livro.

    Aqui está o que cada parte da string retornada representa:

    "titulo=" + titulo: Isso adiciona o título do livro à string.
    "autor=" + autor: Isso adiciona o nome do autor à string.
    "totalPaginas=" + totalPaginas: Isso adiciona o número total de páginas à string.
    "pagAtual=" + pagAtual: Isso adiciona a página atual à string.
    "aberto=" + aberto: Isso adiciona o estado do livro (aberto ou fechado) à string.
    "leitor=" + leitor.getNome(): Isso adiciona o nome do leitor à string.
    "idade = " + leitor.getIdade(): Isso adiciona a idade do leitor à string.
    "sexo = " + leitor.getSexo(): Isso adiciona o sexo do leitor à string.
    Portanto, quando você chama detalhes() em um objeto Livro, ele retorna uma string com todas essas informações sobre o livro.
    */
    
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totalPaginas){
            this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual ++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual --;
    }
    
    
    
    
}

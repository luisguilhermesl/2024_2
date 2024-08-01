package com.mycompany.projetolivro;
public class ProjetoLivro {

    /*Este é um programa Java que usa os conceitos de Programação Orientada a
    Objetos (POO). Ele define uma classe chamada ProjetoLivro que contém o
    método main(). O método main() é o ponto de entrada para qualquer
    aplicação Java.
    */
    
    public static void main(String[] args) {
        
        //No método main(), são criados dois arrays de objetos, um para Pessoa e outro para Livro.
        Pessoa[] p = new Pessoa [2];
        Livro[] l = new Livro[3];
        
        /*
        Aqui, p é um array que pode conter dois objetos do tipo Pessoa e l é um array que pode conter três objetos do tipo Livro.
        Em seguida, são criados dois objetos do tipo Pessoa e três objetos do tipo Livro:
        */
        
        p[0] = new Pessoa ("Luis", 29,"M");
        p[1] = new Pessoa ("Andresa",24,"F");
        
        l[0] = new Livro ("Java para iniciantes", "Roberto Heus", 150, p[0]);
        l[1] = new Livro ("Harry Potter", "Fulana de Tal", 800, p[1]);
        l[2] = new Livro ("Crepusculo","Lalapeuti", 200, p[1]);
        
        /*
        Os objetos Pessoa são criados com os parâmetros nome, idade e sexo. Os 
        objetos Livro são criados com os parâmetros título, autor, número de páginas 
        e a pessoa que está lendo o livro.
        Depois, o programa chama vários métodos no primeiro objeto Livro:
        */
        
        //Estes métodos fazem o seguinte:
        l[0].abrir(); //Abre o livro.
        l[0].folhear(100); //Vira para a página 100.
        l[0].avancarPag(); //Avança uma página.
        System.out.println(l[0].detalhes()); //Retorna uma string com os detalhes do livro, que é então impressa na tela.
        
    }
}


/*
O QUE SÃO OS ARRAYS?
Um array é uma estrutura de dados que armazena uma coleção de elementos (valores ou variáveis), 
cada um identificado por um índice ou chave. Arrays são usados para armazenar vários valores em 
uma única variável, em vez de declarar variáveis separadas para cada valor.

No código em questão, os arrays são usados para armazenar objetos de Pessoa e Livro, 
sendo declarados assim:

        Pessoa[] p = new Pessoa [2];
        Livro[] l = new Livro[3];

Neste caso, Pessoa[] e Livro[] são os tipos dos arrays, indicando que esses arrays armazenarão 
objetos do tipo Pessoa e Livro, respectivamente. p e l são os nomes dos arrays. new Pessoa[2] 
e new Livro[3] são as inicializações dos arrays, indicando que o array p terá espaço para 2 
objetos Pessoa e o array l terá espaço para 3 objetos Livro.

Você pode acessar os elementos de um array usando o nome do array seguido por um índice entre 
colchetes. Por exemplo, p[0] se refere ao primeiro elemento do array p, e l[1] se refere ao 
segundo elemento do array l.


DIFERENÇA DE ARRAY PARA ARRAYLIST

Aqui estão algumas diferenças principais entre arrays e ArrayLists em Java:

Tamanho: O tamanho de um array é fixo. Uma vez que você cria um array, você não 
pode alterar seu tamanho. Por outro lado, um ArrayList é dinâmico. Você pode 
adicionar ou remover elementos, e o tamanho do ArrayList será ajustado dinamicamente.
Tipo de elementos: Um array pode conter primitivos ou objetos, enquanto um ArrayList 
só pode conter objetos (não primitivos).
Métodos e operações: ArrayLists, sendo parte da estrutura de dados do Java Collections 
Framework, têm muitos métodos úteis como add(), remove(), get(), set(), size(), 
clear(), etc. Arrays não têm esses métodos.
Performance: Arrays são mais rápidos e usam menos memória do que ArrayLists, porque 
ArrayLists internamente usam arrays e adicionam alguma funcionalidade adicional 
(como redimensionamento automático, etc.).
Aqui está um exemplo de como você pode usar um ArrayList:

ArrayList<String> lista = new ArrayList<String>();
lista.add("Olá");
lista.add("Mundo");
System.out.println(lista.get(0));  // Imprime "Olá"

*/
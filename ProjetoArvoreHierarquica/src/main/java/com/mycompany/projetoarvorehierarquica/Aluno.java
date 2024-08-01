package com.mycompany.projetoarvorehierarquica;
public class Aluno extends Pessoa{ //voce vai usar o final (public class final Aluno extends Pessoa{), quando nao quiser que ela tenha filha, e isso vai dar erro em Bolsista
    private int matricula;
    private String curso;
    
    //aluno é uma especialização de pessoa, e pessoa é uma generalização de aluno
    public void pagarMensalidade(){ //  public void pagarMensalidade(){ uma classe final nao pode ter filhos
        System.out.println("Pagando mensalidade de aluno(a)" + this.nome); // o acesso protegido da acesso a sua propria classe, e a classe superclasse, senão teria que ser getNome, caso fosse private
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}

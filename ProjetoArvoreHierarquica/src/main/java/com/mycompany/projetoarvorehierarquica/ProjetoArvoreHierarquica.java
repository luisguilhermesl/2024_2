package com.mycompany.projetoarvorehierarquica;
public class ProjetoArvoreHierarquica {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        
        /*Visitante v1 = new Visitante();
        v1.setNome("Luis");
        v1.setIdade(29);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
       
      /* Aluno a1 = new Aluno();
       a1.setNome("Andresa");
       a1.setMatricula(1111);
       a1.setCurso("Fisioterapia");
       a1.setIdade(24);
       a1.setSexo("F");
       a1.pagarMensalidade();
       System.out.println(a1.toString());*/
       
      Bolsista b1 = new Bolsista();
      b1.setMatricula(2222);
      b1.setNome("Amy");
      b1.setIdade(7);
      b1.setBolsa(12.5f);
      b1.setSexo("F");
      b1.pagarMensalidade(); //uso a sobreposição, não sendo o mesmo pagarMensalidade do aluno do bolsista
      System.out.println(b1.toString());
      
       
        
    }
}

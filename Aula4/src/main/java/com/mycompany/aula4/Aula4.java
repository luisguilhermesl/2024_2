package com.mycompany.aula4;

public class Aula4 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nic","Amarela",0.4f);
       
        //c1.setModelo("Bic");
     //   c1.modelo = "Bic";
        
     //   c1.setPonta(0.7f);
      //  c1.ponta = 0.5f;
        
       c1.status();
       
       System.out.println("Tenho uma canete " + c1.getModelo() + " de ponta "+ c1.getPonta());
        
    }
}

package com.mycompany.aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
      //  c1.ponta = 0.5f;
        c1.carga = 80; //ele deixa mexer nesse atributo protegido porque ele está dentro de uma classe que utiliza a classe caneta
        //c1.tampada = false;
        
        c1.status();
        c1.tampar();
        c1.rabiscar();

    }
}

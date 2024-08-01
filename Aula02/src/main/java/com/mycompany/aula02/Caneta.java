package com.mycompany.aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("É uma caneta "+this.modelo);
        System.out.println("Uma caneta " +this.cor);
        System.out.println("Está tampada? " +this.tampada);
        System.out.println("Ponta: "+this.ponta);
        
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Não pode rabiscar");
        }else{
            System.out.println("Pode rabiscar");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}

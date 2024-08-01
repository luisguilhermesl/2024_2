package com.mycompany.aula4;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String m, String c, float p){ //este é o metodo construtor
       this.modelo = m;
       this.cor = c;
       this.ponta = p;     
       this.tampar();
       // this.cor = "azul";
        
    }
    
    public void status(){
        System.out.println("Modelo: " +this.getModelo());
        System.out.println("Ponta: " +this.getPonta());
        System.out.println("Cor: " +this.getCor());
        System.out.println("Tampada: " +this.tampada);
      
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampada(){
        this.tampada = false;
    }
    
    
    
    
    
}

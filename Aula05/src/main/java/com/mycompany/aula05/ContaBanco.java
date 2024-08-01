package com.mycompany.aula05;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Personalizados
    
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
           // this.saldo = 50; // aqui estamos mexendo direto no atributo
            this.setSaldo(50); //aqui estamos mexendo no método
        }else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if(this.getSaldo()> 0){
            System.out.println("Conta não pode ser fechada porque ainda contém dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada porque ainda contém débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v){
       if(this.getStatus()){
         //  this.saldo = this.saldo + v;
         this.setSaldo(this.getSaldo() + v);
           System.out.println("Depósito realizado na conta de "+this.getDono());
       }else{
           System.out.println("Impossivel depositar em uma conta fechada");
       }
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saldo");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensal(){
        float v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if (this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade pagar com sucesso por "+this.getDono());
            }else{
                System.out.println("Saldo inssuficiente");
            }
        }else{
            System.out.println("Impossivel pagar");
            
        }
    }
    
    //Métodos Especiais
    
    public void ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() { //todo método que retorna boolean ele nao usa get ele usa is
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    
}

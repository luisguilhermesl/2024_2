package com.mycompany.projetoarvorehierarquica;

//o extends, sendo de uma final class, nao pode funcionar, voce pode usar os final nos metodos caso nao queira que eles sejam sobrepostos

public class Bolsista extends Aluno{ 
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " +this.nome);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + "é bolsista!Pagamento Facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}

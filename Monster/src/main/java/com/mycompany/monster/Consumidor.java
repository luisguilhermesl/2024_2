
package com.mycompany.monster;

public class Consumidor {
    private Monster mongoloco;
    private Monster original;
    private int quantasLatas;
    private boolean gostou;

    public Monster getMongoloco() {
        return mongoloco;
    }

    public void setMongoloco(Monster mongoloco) {
        this.mongoloco = mongoloco;
    }

    public Monster getOriginal() {
        return original;
    }

    public void setOriginal(Monster original) {
        this.original = original;
    }

    public int getQuantasLatas() {
        return quantasLatas;
    }

    public void setQuantasLatas(int quantasLatas) {
        this.quantasLatas = quantasLatas;
    }

    public boolean isGostou() {
        return gostou;
    }

    public void setGostou(boolean gostou) {
        this.gostou = gostou;
    }



    public Consumidor(Monster mongoloco, Monster original, int quantasLatas, boolean hospital) {
        this.mongoloco = mongoloco;
        this.original = original;
        this.quantasLatas = quantasLatas;
        this.hospital = hospital;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package while_lista;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Main { 
 public static void main(String[] args) { 
 ArrayList<String> cidades = new ArrayList<String>();
 cidades.add("São Paulo");
 cidades.add("Santos");
 cidades.add("Ribeirão Preto");
 cidades.add(0, "Campinas");
 System.out.println(cidades);
 } 
}
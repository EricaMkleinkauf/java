/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

/**
 *
 * @author ERICAMACHADOKLEINKAU
 */
import java.util.ArrayList;
import java.util.Scanner;
abstract public class Produto {

    public String nome;
    public double preco;
    public String tipo;
    
    public Produto(String nome, double preco, String tipo){
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }
    
    abstract public void detalhesPedido();
}

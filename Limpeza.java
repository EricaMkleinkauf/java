/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ERICAMACHADOKLEINKAU
 */
public class Limpeza extends Produto {

    public Limpeza() {
        super("esponja", 6.60, "limpeza");
    }
 
    @Override
    public void detalhesPedido(){
        System.out.println("O" + nome + "custou" + preco);
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes.Abstratas;

/**
 *
 * @author ERICAMACHADOKLEINKAU
 */
abstract class Mobilia {
    protected String cor;
    protected String material;
    
    public Mobilia(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }

    public abstract void montar();

    public void desmontar() {
        System.out.println("Desmontando a mobília.");
    }
}

   
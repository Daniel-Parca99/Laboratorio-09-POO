/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio09;

import entidades.Guerrero;
import entidades.Arquero;
import entidades.Mago;


/**
 *
 * @author Daniel
 */
public class Laboratorio09 {


    public static void main(String[] args) {
        
        Arquero arquero = new Arquero("Archer", 150, 1, 8, 99);
        arquero.mostrarDatos();
        
        Guerrero guerrero = new Guerrero("Spartan", 250, 2, 50, 40);
        guerrero.mostrarDatos();
        
        Mago mago = new Mago("Magic", 200, 2, 130, 90);
        mago.mostrarDatos();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.relaciondecomposicion;

/**
 *
 * @author DanielAlexandro
 */
public class POORelacionDeComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Telefono starTac = new Telefono();
        
        starTac.EA.presionar();
        System.out.println("El telefono StarTac esta " + starTac.EA.IO);
        
        starTac.EA.presionar(); 
        System.out.println("El telefono StarTac esta " + starTac.EA.IO);
        
        starTac.EA.presionar(); 
        System.out.println("El telefono StarTac esta " + starTac.EA.IO);
        
        starTac.setTeclado();
        System.out.println("\nMostrar teclado:");
        for (int i = 0; i < starTac.Teclado.length; i++) {
            for (int j = 0; j < starTac.Teclado[0].length; j++) {
                System.out.print(starTac.Teclado[i][j].getDigito() + " ");
            }
            System.out.println("");
        }
    }
    
}

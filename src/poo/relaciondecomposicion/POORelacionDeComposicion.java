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
        
        starTac.setTeclado();
        System.out.println("\nMostrar teclado:");
        for (int i = 0; i < starTac.Teclado.length; i++) {
            for (int j = 0; j < starTac.Teclado[0].length; j++) {
                System.out.print(starTac.Teclado[i][j].getDigito() + " ");
            }
            System.out.println("");
        }
        
        Telefono.guardaContacto("Daniel", "1234567", "cykablyat@itesm.mx");
        Telefono.guardaContacto("Netito", "7654321", "ers_panda@hotmail.com");
        Telefono.guardaContacto("Zepen", "8459324", "zepen_necky@hotmail.com");
        Telefono.showContacto(0);
        Telefono.guardaContactoEnN(99, "Luisa", "75648292", "luisa_pineda@licenciada.com");
        Telefono.showLista();
    }
    
}

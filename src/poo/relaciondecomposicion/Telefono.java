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
public class Telefono {
    //Atributo, instanciar objeto
    public botonApagar EA = new botonApagar();
    public Tecla Teclado[][] = new Tecla[5][3];
    
    //Methods
    //Constructor
    public Telefono() {
        
    }
    
    public void setTeclado() {
        int t = 1;
        for (int i = 0; i < ((Teclado.length) - 1); i++) {
            for (int j = 0; j < Teclado[0].length; j++) {
                Tecla temp = new Tecla();
                temp.setDigito((String.valueOf(t)).charAt(0));
                Teclado[i][j] = temp;
                t++;
            }
        }
        
        Tecla temp1 = new Tecla();
        Tecla temp2 = new Tecla();
        Tecla temp3 = new Tecla();
        Tecla temp4 = new Tecla();
        Tecla temp5 = new Tecla();
        Tecla temp6 = new Tecla();
        
        temp1.setDigito('0');
        Teclado [3][1] = temp1;
        temp2.setDigito('*');
        Teclado [3][0] = temp2;
        temp3.setDigito('#');
        Teclado [3][2] = temp3;
        temp4.setDigito('C');
        Teclado [4][0] = temp4;
        temp5.setDigito('S');
        Teclado [4][1] = temp5;
        temp6.setDigito('T');
        Teclado [4][2] = temp6;
        
    }
}

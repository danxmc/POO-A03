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
    public Tecla[][] Teclado = new Tecla[5][3];
    public static Contacto[] Lista = new Contacto[100];

    //Methods
    //Constructor
    public Telefono() {

    }

    /**
     * Method que guarda y sobreescribe en un indice especifico ingresado por el usuario,
     * un nuevo contacto que escribe el usuario.
     * @param n
     * @param name
     * @param tel
     * @param mail 
     */
    public static void guardaContactoEnN(int n, String name, String tel, String mail) {
        if (n < 100 && n >= 0) {
            Contacto Temp = new Contacto(name, tel, mail);
            Lista[n] = Temp;
        } else {
            System.out.println("El numero no esta en un rango valido de contactos.");
        }
    }
    
    /**
     * Method que guarda un contacto, primero llama a buscar un espacio en el array
     * y luego asigna los datos a ese indice en el array.
     * @param name
     * @param tel
     * @param mail 
     */
    public static void guardaContacto(String name, String tel, String mail) {
        int espacio = buscaEspacio(Lista);
        if (espacio < 0) {
            System.out.println("Lista llena, no se puede agregar un nuevo contacto");
        } else {
            Contacto Temp = new Contacto(name, tel, mail);
            Lista[espacio] = Temp;
        }
    }

    /**
     * Method que busca un espacio diponible en la lista de array de constacto
     * @param Lista, array que contiene los contactos
     * @return t el indice del primer contacto libre que se encuentre en el array
     */
    private static int buscaEspacio(Contacto[] Lista) {
        int t = -1;
        for (int i = 0; i <= Lista.length; i++) {
            if (Lista[i] == null) {
                t = i;
                i = 101;
            }
        }
        return t;
    }

    /**
     * Method que muestra un contacto especifico ingresado por el usuario.
     * @param n 
     */
    public static void showContacto(int n) {
        Lista[n].getContacto();
    }
    
    /**
     * Method que muestra la lista completa de los contactos
     */
    public static void showLista() {
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i] == null) {
                System.out.println("Contacto " + i + ", no existe.\n");
            } else {
                System.out.println("Contacto " + i + "\n");
                Lista[i].getContacto();
            }
        }
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
        Teclado[3][1] = temp1;
        temp2.setDigito('*');
        Teclado[3][0] = temp2;
        temp3.setDigito('#');
        Teclado[3][2] = temp3;
        temp4.setDigito('C');
        Teclado[4][0] = temp4;
        temp5.setDigito('S');
        Teclado[4][1] = temp5;
        temp6.setDigito('T');
        Teclado[4][2] = temp6;

    }
}

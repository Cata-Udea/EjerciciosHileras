/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author catax
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        String cadena = "Holaaaaa cata como estas?";
        char aCar;
        
        ListaHilera hileraLL = new ListaHilera(cadena);
        hileraLL.representarHileraEnLL();
        
        //Ver Lista Hilera
        System.out.println("Hilera original");
        aCar=hileraLL.mostrarHileraEnLL();
        while(aCar!='*')
        {
            System.out.print(aCar);
            aCar = hileraLL.mostrarHileraEnLL();
        }
        System.out.println();
        
        System.out.println("Cambiar en la primera palabra todas las ‘a’ minúsculas por ‘A’ mayúsculas");
        hileraLL.cambiarAPrimerPalabra();
        //Ver Lista Hilera
        aCar=hileraLL.mostrarHileraEnLL();
        while(aCar!='*')
        {
            System.out.print(aCar);
            aCar = hileraLL.mostrarHileraEnLL();
        }
        System.out.println();
        
        System.out.println("Elimine el último carácter de la segunda palabra.");
        hileraLL.eliminarUltCarSegPalaba();
        //Ver Lista Hilera
        aCar=hileraLL.mostrarHileraEnLL();
        while(aCar!='*')
        {
            System.out.print(aCar);
            aCar = hileraLL.mostrarHileraEnLL();
        }
        System.out.println();
        
        System.out.println("Intercambie en la tercera palabra el primer carácter por el ultimo, asuma que tiene\n" +
                            "varios caracteres");
        hileraLL.interambioTerceraPalabra();
        //Ver Lista Hilera
        aCar=hileraLL.mostrarHileraEnLL();
        while(aCar!='*')
        {
            System.out.print(aCar);
            aCar = hileraLL.mostrarHileraEnLL();
        }
        System.out.println();
    }
    
}

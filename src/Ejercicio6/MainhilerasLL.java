/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author catax
 */
public class MainhilerasLL 
{
    public static void main(String[] args) {
        
        char carH;
        String pHilera= "CATALuLinE COmo Estas Ahi";
        ListaLHilera objHileraEnLL1= new ListaLHilera(pHilera);
        objHileraEnLL1.representarHileraEnLL();
        
        //Mostar hilera
        System.out.println("Mostar hilera");
        carH=objHileraEnLL1.mostrarHilera();
        while(carH!='*')
        {
            System.out.print(carH);
            carH=objHileraEnLL1.mostrarHilera();
        }
        
        //Tiene las 5 vocales min
        System.out.println("\nTiene las 5 vocales");
        char[] listaVocales = {'a','e','i','o','u'};
        for(int i=0; i<=listaVocales.length-1; i++)
        {
            System.out.println("Tiene "+listaVocales[i]+"? "+objHileraEnLL1.apareceVocal(listaVocales[i]));
        }
        
        //Cuantas veces las 5 vocales may
        System.out.println("\nCuantas veces Tiene las 5 vocales mayúsculas");
        char[] listaVocalesM = {'A','E','I','O','U'};
        for(int i=0; i<=listaVocalesM.length-1; i++)
        {
            System.out.println("Tiene "+listaVocalesM[i]+"? "+objHileraEnLL1.contarApariciones(listaVocalesM[i]));
        }
        
        //apariciones caracter
        System.out.println("\nTiene L? "+objHileraEnLL1.contarApariciones('L'));
       
        //Eliminar apariciones de un caracter determinado
        objHileraEnLL1.elimAparicionesCar('A');
        //Mostar hilera
        System.out.println("Mostar hilera");
        carH=objHileraEnLL1.mostrarHilera();
        while(carH!='*')
        {
            System.out.print(carH);
            carH=objHileraEnLL1.mostrarHilera();
        }        
    }
}

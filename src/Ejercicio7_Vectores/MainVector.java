
package Ejercicio7_Vectores;

import java.awt.image.BandCombineOp;

public class MainVector {
    public static void main(String[] args) {
        
        char pCar, vocSelec=' ';
        boolean band=true;
        
        HilerasEnVector objHileraEnVector1 = new HilerasEnVector("Cutalina");
        objHileraEnVector1.representarHileraEnVector();
        
        HilerasEnVector objHileraEnVector2 = new HilerasEnVector("Hernandez");
        objHileraEnVector2.representarHileraEnVector();
        
        char[] listaVocal = {'a','e','i','o','u'};
        pCar= objHileraEnVector1.mostrarHileraEnVector();
        while(band){
            System.out.println("pCar "+pCar);
            for(int i=0; i<=listaVocal.length-1; i++){
                if(pCar==listaVocal[i])
                {
                    vocSelec = listaVocal[i];
                    band=false;
                }
            }
            if(pCar=='*'){
                band=false;
            }
            pCar=objHileraEnVector1.mostrarHileraEnVector();
        }
        System.out.println("sali");
        System.out.println("La vocal "+vocSelec+" aparece "+objHileraEnVector2.vecesCar(vocSelec)+" veces");
    }
}

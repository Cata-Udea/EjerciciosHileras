
package Ejercicio7_ListasLigadas;

import java.awt.image.BandCombineOp;

public class MainHilera 
{
    public static void main(String[] args) {
        
        char pCar,lVocal=' ';
        boolean band=true;
        HileraEnLL objHileraLL1= new HileraEnLL("aaaaaasta?");
        objHileraLL1.representarHileraEnLL();
        HileraEnLL objHileraLL2 = new HileraEnLL("Biena, no tanto");
        objHileraLL2.representarHileraEnLL();
        
        
        pCar = objHileraLL1.mostrarHileraLL();
        char[] listaVocal = {'a','e','i','o','u'};
        while(band){
            System.out.println("pCar: "+pCar);
            for(int i=0; i<=listaVocal.length-1;i++)
            {
                if(pCar==listaVocal[i])
                {
                    lVocal=listaVocal[i];
                    band=false;
                }
            }
            if(pCar=='*'){
                band=false;
            }
            pCar=objHileraLL1.mostrarHileraLL();
        }
        
        System.out.println("La vocal "+lVocal+" aparece "+objHileraLL2.vecesAparicion(lVocal)+" veces");
    }
    
    
}

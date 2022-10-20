/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author catax
 */
public class HilerasEnVector {
    
    private String hilera;
    private char [] vectorHilera;
    private int cantReal, x;
    
    public HilerasEnVector(String pHilera){
        this.hilera= pHilera;
        this.cantReal = hilera.length();
        vectorHilera = new char[cantReal+10];
        x=-1;
    }
    
    public void representarHileraEnVector(){
        for(int i=0; i<cantReal-1; i++){
            vectorHilera[i]=hilera.charAt(i);
        }
    }
    
    public char mostrarHilera(){
        ++x;
        if(x<=cantReal)
            {return vectorHilera[x];}
        else
            {x=-1;
            return '*';}
    }
    
   public boolean tieneVocalMinusc(char pVocal)
   {
       boolean respuesta=false;
       for(int i=0; i<=cantReal-1; i++){
           if(vectorHilera[i]==pVocal)
           {
                respuesta=true;
           }
       }
       return respuesta;
   }
   
   public int cantApariciones(char pVocal)
   {
       int veces=0;
       for(int i=0; i<=cantReal-1;i++){
           if(vectorHilera[i]==pVocal)
           {
               veces++;
           }
       }
       return veces;
   }
   
   public void eliminarApariciones(char pChar){
       for(int i=0; i<cantReal-1;i++){
           if(vectorHilera[i]==pChar){
               for(int j=i;j<=cantReal-2;j++)
               {
                   vectorHilera[j]=vectorHilera[j+1];
               }
               
           }      
       }
   }
}


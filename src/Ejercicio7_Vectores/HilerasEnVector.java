/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7_Vectores;

/**
 *
 * @author catax
 */
public class HilerasEnVector {
    
    private String hilera;
    private int cantReal,x;
    private char [] hileraVector;
    
    public HilerasEnVector(String pCadena){
        hilera= pCadena;
        cantReal=hilera.length();
        hileraVector = new char[cantReal+10];
        x=-1;
    }
    
    public void representarHileraEnVector(){
        for(int i=0; i<=cantReal-1; i++){
            hileraVector[i]=hilera.charAt(i);
        }
    
    }
    
    public char mostrarHileraEnVector()
    {
        ++x;
        if(x<=cantReal){
            return hileraVector[x];
        }else{
            x=-1;
            return '*';
        }
    }
    
    public int vecesCar(char pCar){
        int veces=0;
        ++x;
        while(x<cantReal){
            if(hileraVector[x]==pCar){
                veces++;
            }
            ++x;
        }
        x=-1;
        return veces;
    }
}

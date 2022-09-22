/*Crear 3 (tres) hileras (cada una representada como un vector), se pide para cada
hilera:
a) Averiguar cuántas veces se repite (aparece) un determinado carácter (leído)
b) Averiguar cuántas veces se repite (aparece) el primer carácter de la hilera en toda la
hilera
c) Averiguar cuántas veces se repite (aparece) el último carácter de la hilera en toda la
hilera
d) Cambiar todas las apariciones de un carácter determinado (leído) por otro carácter
determinado (leído) */
package Ejercicio3;

public class HilerasEnVector 
{
    private String hilera;
    private char[] vectorHilera;
    private int cantReal,x, pNum;
    private char paramCar;
    
    public HilerasEnVector(String pCadena)
    {
        hilera = pCadena;
        cantReal = hilera.length();
        vectorHilera = new char[cantReal+10];
        x=-1;
    }
    
    public void representarHileraVector() 
    {
        for (int i = 0; i < hilera.length(); i++) 
        {
            vectorHilera[i] = hilera.charAt(i);
        }
    }
    
    public char mostrarHilera()
    {
        ++x;
        if(x<=cantReal)
        {
            return vectorHilera[x];
        }else{
            x=-1; //reinicio
            return '*'; //retorno centinela
        }
    }
    
    public int cuantasVecesCaracterDado(char pChar)
    {
        
        int contCar=0;
        for (int i = 0; i < cantReal; i++) 
        {
            if(vectorHilera[i]==pChar)
            {
                contCar++;
            }
        }
        return contCar;
    }
    
    public int cuantasVecesPrimerCar()
    {
        pNum=0;
        paramCar = vectorHilera[0];
        for (int i = 0; i < cantReal; i++) {
            if(vectorHilera[i]==paramCar){
                pNum++;
            }
        }
        return pNum;
    }
    
    public int cuantasVecesUltCar()
    {
        pNum=0;
        paramCar=vectorHilera[cantReal-1];
        for (int i = cantReal-1; i>=0; i--) {
            if(vectorHilera[i]==paramCar){
                pNum++;
            }
        }
        return pNum;
    }
    
    public void cambioCaracter(char pCarOriginal,char pCarFinal)
    {
        for (int i = 0; i < cantReal-1; i++) {
            if(vectorHilera[i]==pCarOriginal)
                {vectorHilera[i]=pCarFinal;}
        }
    }
    
    
    
}

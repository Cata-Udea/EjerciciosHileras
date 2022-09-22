/*
a) Averiguar cuántas veces se repite (aparece) un determinado carácter (leído)
b) Averiguar cuántas veces se repite (aparece) el primer carácter de la hilera en toda la
hilera
c) Averiguar cuántas veces se repite (aparece) el último carácter de la hilera en toda la
hilera
d) Cambiar todas las apariciones de un carácter determinado (leído) por otro carácter
determinado (leído)
*/
package Ejercicio4;

/**
 *
 * @author catax
 */
public class ListaHilera 
{
    private String hilera;
    private Nodo cab, ult, x;
    int cont;
    char car;
    
    public ListaHilera(String pCadena)
    {
        hilera = "";
        cab = new Nodo('*');
        ult=x=cab;
    }
    
    public void representarCadenaEnHilera(String pCadena)
    {
        x=x.getLiga();
        for (int i = 0; i < pCadena.length() ; i++) 
        {
            x=new Nodo(pCadena.charAt(i));
            ult.setLiga(x);
            ult=x;
        }
        x=cab;
    }
    
    public int vecesCaracter(char pCar)
    {
        x=cab.getLiga();
        cont = 0;
        while(x!=null)
        {
            if(x.getInfo()==pCar)
                {cont++;}
            x=x.getLiga();
        }
        x=cab;
        return cont++;
    }
    
    public int vecesPrimerCaracter()
    {
        x=cab.getLiga(); //enpiezo desde primera posicion de la hilera
        car=x.getInfo(); //caracter a comparar
        cont=0;
        
        while(x!=null)
        {
            if(x.getInfo()==car)
                {cont++;}
            x=x.getLiga();
        }
        x=cab;
        return cont++;
    }
    
    public int vecesUltCaracter()
    {
        car = ult.getInfo(); //caracter a evaluar
        x=x.getLiga();
        cont = 0;
        
        while(x!=null)
        {
            if(x.getInfo()==car)
                {cont++;}
            x=x.getLiga();
        }
        x=cab;
        return cont++;
    }
    
    public void cambiarCaracter(char pEntrada, char pSalida)
    {
        
    
    }
    
    
}

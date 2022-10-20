
package Ejercicio7_ListasLigadas;

public class NodoHilera 
{
    private char infoNodo;
    private NodoHilera liga;
    
    public NodoHilera(char pCar){
        infoNodo=pCar;
        liga=null;
    }

    public char getInfoNodo() {
        return infoNodo;
    }

    public void setInfoNodo(char infoNodo) {
        this.infoNodo = infoNodo;
    }

    public NodoHilera getLiga() {
        return liga;
    }

    public void setLiga(NodoHilera liga) {
        this.liga = liga;
    }
    
    
}

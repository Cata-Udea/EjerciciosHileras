
package Ejercicio2;

public class NodoHilera 
{
    private char infoCaracter;
    private NodoHilera liga;
    
    public NodoHilera(char pChar){
        infoCaracter = pChar;
        liga=null;
    }

    public char getInfoCaracter() {
        return infoCaracter;
    }

    public void setInfoCaracter(char infoCaracter) {
        this.infoCaracter = infoCaracter;
    }

    public NodoHilera getLiga() {
        return liga;
    }

    public void setLiga(NodoHilera liga) {
        this.liga = liga;
    }
    
    
}

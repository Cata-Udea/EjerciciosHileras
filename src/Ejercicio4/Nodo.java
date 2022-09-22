
package Ejercicio4;

public class Nodo 
{
    private char info;
    private Nodo liga;

    public Nodo(char pChar)
    {
        info = pChar;
        liga=null;
    }

    public char getInfo() {
        return info;
    }

    public void setInfo(char info) {
        this.info = info;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
    
    

}


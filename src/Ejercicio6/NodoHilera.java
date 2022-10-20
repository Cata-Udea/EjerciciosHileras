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
public class NodoHilera {
    
    private char infoNodo;
    private NodoHilera liga;
    
    public NodoHilera(char pChar){
        infoNodo=pChar;
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


package Ejercicio2;

/*
Representar una hilera como lista ligada, además:
a) Cambiar en la primera palabra todas las ‘a’ minúsculas por ‘A’ mayúsculas
b) Elimine el último carácter de la segunda palabra.
c) Intercambie en la tercera palabra el primer carácter por el ultimo, asuma que tiene
varios caracteres*/

public class ListaHilera 
{
    private String hilera;
    private NodoHilera cab,ult, x, p;
    
    public ListaHilera(String pHilera)
    {
        hilera=pHilera;
        cab = new NodoHilera('*');
        ult=x=p=cab;
    }
    
    public void representarHileraEnLL()
    {
        for (int i = 0; i < hilera.length(); i++) 
        {   
            x= new NodoHilera(hilera.charAt(i));
            ult.setLiga(x);
            ult=x;
        }
        x=cab;
    }
    
    public char mostrarHileraEnLL()
    {
        x=x.getLiga();
        if(x==null)
            {x=cab;}
        return x.getInfoCaracter();
    }
    
    public void cambiarAPrimerPalabra()
    {
        x=cab.getLiga();
        while(x.getInfoCaracter()!=' ')
        {
            if(x.getInfoCaracter()=='a')
                {x.setInfoCaracter('A');}
            x=x.getLiga();
        }
        x=cab;
    }
    
    private NodoHilera primerEspacioBlanco(NodoHilera pNodo)
    {
        x=pNodo.getLiga();
        while(x.getInfoCaracter()!=' ') //itero desde cab hasta primer espacio blanco
        {
            x=x.getLiga();
        }
        return x;
    }
    
    public void eliminarUltCarSegPalaba()
    {
        //Averiguamos primera posicion de segunda palabra
        p=this.primerEspacioBlanco(cab); //primer espacio blanco //penulltimo
        x=p.getLiga(); //primer caraxter luego de primer espacio blanco //ultimo
        while(x.getLiga().getInfoCaracter()!=' ')
        {
            //System.out.println("entre"+x.getInfoCaracter());
            p=p.getLiga(); //itero, me transporto hasta pemult y ultima posicion de segunda palabra
            x=x.getLiga();
        }
        
        p.setLiga(x.getLiga()); //penult lo ligo al espacio en blanco seguido del ultimo caract
        //System.out.println("p es "+p.getInfoCaracter());
        //System.out.println("x es "+x.getInfoCaracter());
        x.setLiga(null); //saco a ult, lo desligo d ela lista
        x=cab; //actualizo a cab, para usar los otros metodos (mostrar)
    
    }
    
    public void interambioTerceraPalabra()
    {
        p=this.primerEspacioBlanco(cab); //primer espacio blanco
        p=this.primerEspacioBlanco(p); //segundo espacio blanco
        
        NodoHilera primero =p.getLiga(); //comodin primera leta
        NodoHilera ultimo, comodin; //ultimo y comodin
        x=primero.getLiga(); //comienzo a iterar
        while(x.getLiga().getInfoCaracter()!=' ')
        {
            x=x.getLiga(); //itero hasta final tercera palabra, en su ultimo caracter
        }
        ultimo=x; //asigno a ultimo
        comodin= new NodoHilera(x.getInfoCaracter()); //intercambio el info de prim y ult
        ultimo.setInfoCaracter(primero.getInfoCaracter());
        primero.setInfoCaracter(comodin.getInfoCaracter());
        x=cab; //actualizo a cab para otros metodos
    }
    
    
    
}

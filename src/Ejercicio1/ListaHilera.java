
package Ejercicio1;
/*1. Se pide crear una hilera (representada como lista ligada), además:
a) Elimine todos los espacios en blanco.
b) Cambiar todas las ‘a’ minúsculas por un carácter que entra como parámetro
c) Mostrar la hilera original y final
*/
public class ListaHilera 
{
    private String hilera;
    private NodoHilera cab, ult,x,p;
    
    public ListaHilera(String pCadena)
    {
        hilera = pCadena;
        cab= new NodoHilera('*');
        ult=x=p=cab;   
    }
    
    public void representarStringEnLL()
    {
        for (int i = 0; i < hilera.length(); i++) 
        {
            x = new NodoHilera(hilera.charAt(i));
            ult.setLiga(x);
            ult=x;
        }
        x=cab;
    
    }
    
    public char mostrarHileraEnLL(){
        p=p.getLiga();
        if(p == null)
            {p=cab;}
        return p.getInfoCaracter();
    }
    
    public void eliminarEspaciosBlanco()
    {
        p=cab;
        x=p.getLiga();
        while(x!=null)
        {
            if(x.getInfoCaracter()==' ')
            {   
                p.setLiga(x.getLiga());//desconecto el nodo por el lado izq
                p=p.getLiga(); //actualizo p
                x.setLiga(null); //desconecto el nodo por el lado der
                x=p.getLiga(); //actualizo a x
            } else 
            {
                p=p.getLiga();
                x=x.getLiga();
            }
        }
        p=cab;
    }
    
    public void cambiarAMinporPar(char pCaracter)
    {
        p=p.getLiga();
        while(p!=null)
        {
            if(p.getInfoCaracter()=='a')
                {p.setInfoCaracter(pCaracter);}
            p=p.getLiga();
        }
        p=cab;
        
    }
}

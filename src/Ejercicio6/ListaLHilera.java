package Ejercicio6;

public class ListaLHilera {
    
    private String hilera;
    private NodoHilera cab,ult,x,p;
    
    public ListaLHilera(String pHilera){
        hilera=pHilera;
        cab= new NodoHilera('*');
        ult=x=p=cab;
    }
    
    public void representarHileraEnLL()
    {
        for(int i=0; i<=hilera.length()-1; i++)
        {
            x= new NodoHilera(hilera.charAt(i));
            ult.setLiga(x);
            ult=x;
        }
        x=cab;
    }
    
    public char mostrarHilera()
    {
        x=x.getLiga();
        if(x==null)
            {x=cab;}
        return x.getInfoNodo();  
    }
    
    public boolean apareceVocal(char pVocal)
    {       
        boolean aparece=false;
        x=x.getLiga();
        while(x!=null)
        {
            if(x.getInfoNodo()==pVocal)
            {
                aparece = true;
            }
            x=x.getLiga();
        }
        x=cab;
        return aparece;
    }
    
    public int contarApariciones(char pCar)
    {
        int cantidad=0;
        x=x.getLiga();
        while(x!=null)
        {
            if(x.getInfoNodo()==pCar)
            {
                cantidad++;
            }
            x=x.getLiga();
        }
        x=cab;
        return cantidad;
    }
    
    public void elimAparicionesCar(char pCar)
    {
        //p=cab;
        x=x.getLiga();
        while(x!=null)
        {
            if(x.getInfoNodo()==pCar)
            {
                p.setLiga(x.getLiga());
            }
            p=x;
            x=x.getLiga();
        }
        x=p=cab;
    }
}


package Ejercicio9;

public class HilerasEnLL {
    private String hilera;
    private NodoHilera cab, ult, p,q;
    private int x;
    
    public HilerasEnLL(String pCadena){
        hilera=pCadena;
        cab = new NodoHilera('*');
        ult=p=q=cab;
        x=-1;
    }
    
    public void representarHileraEnLL(){       
        for(int i=0; i<=hilera.length()-1;i++){
            p = new NodoHilera(hilera.charAt(i));
            ult.setLiga(p);
            ult=p;
        }
        p=cab;
    }
    
    public char mostrarHileraEnLL()
    {
        p=p.getLiga();
        if(p ==null){
            p=cab;
        }
        return p.getInfoNodo();
    }
  
    public void eliminarCar(char pCar){
       p=p.getLiga();
       while(p.getInfoNodo()!=' '){
           if(p.getInfoNodo()=='a')
           {
               q.setLiga(p.getLiga());
           }
           q=p;
           p=p.getLiga();
       }
       p=cab;
       q=cab;
    }
    
    public NodoHilera encontrarPrimerNodoOrdPalabra(int orden)
    {
        NodoHilera l;
        int i=1;
        while (i<orden)
        {
            p=p.getLiga();
            while(p.getInfoNodo()!=' ')
            {
                p=p.getLiga();
            }
            i++;
        }
        
        l=p.getLiga();
        p=cab;
        return l; 
    }
    
    public int contarCaracteresSegPal()
    {
        int cont=0;
        p=encontrarPrimerNodoOrdPalabra(2);
        while(p.getInfoNodo()!=' '){
            cont++;
            p=p.getLiga();
        }
        p=cab;
        return cont;
    }
    
    public void intercambiarTercerPalabra(){
        q=encontrarPrimerNodoOrdPalabra(3);
        p=q.getLiga();
        NodoHilera primerTercer=q;
        
        while(p.getInfoNodo()!=' '){ //Para ult posic de tercera palabra
            q=p;
            p=p.getLiga();
        }
        
        NodoHilera ultimTercer = q;
        char comodin=primerTercer.getInfoNodo();
        
        primerTercer.setInfoNodo(ultimTercer.getInfoNodo());
        ultimTercer.setInfoNodo(comodin);
        
        p=q=cab;
    }
    
}

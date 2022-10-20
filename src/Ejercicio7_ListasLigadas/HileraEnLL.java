package Ejercicio7_ListasLigadas;

public class HileraEnLL {
    
    private String hilera;
    private NodoHilera cab,ult,x,p;
    
    public HileraEnLL(String pHilera){
        hilera = pHilera;
        cab = new NodoHilera('*');
        ult=x=p=cab;
    }
    
    public void representarHileraEnLL()
    {
        for(int i=0; i<=hilera.length()-1;i++){
            x = new NodoHilera(hilera.charAt(i));
            ult.setLiga(x);
            ult=x;
        }
        x=cab;
    }
    
    public char mostrarHileraLL(){
        x=x.getLiga();
        if(x==null){
            x=cab;
        }
        return x.getInfoNodo();
    }
    
    public int vecesAparicion(char pCar)
    {
        int veces=0;
        x=x.getLiga();
        while(x!=null)
        {
            if(x.getInfoNodo()==pCar){
                ++veces;
            }
            x=x.getLiga();
        }
        x=cab;
        return veces;
    }
}

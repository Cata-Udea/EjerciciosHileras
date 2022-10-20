
package Ejercicio5;

public class MainVector {
    
    public static void main(String[] args) {
        
        char pCar;
        HilerasEnVector hileraVector1 = new HilerasEnVector("CATALuLinE COmo Estas Ahi");
        hileraVector1.representarHileraEnVector();
        
        pCar = hileraVector1.mostrarHilera();
        while(pCar!='*')
        {
            System.out.print(pCar);
            pCar=hileraVector1.mostrarHilera();
        }
        
        //Tiene las 5 vocales minusculas
        System.out.println("\nTiene las 5 vocales minusculas?");
        char[] listaVocales = {'a','e','i','o','u'};
        for(int i=0; i<=listaVocales.length-1;i++)
        {
            System.out.println("Tiene vocal "+listaVocales[i]+"?: "+hileraVector1.tieneVocalMinusc(listaVocales[i]));
        }
        
        //Contar las 5 vocales mayusclas
        System.out.println("\nContar las 5 vocales mayusculas?");        
        char[] listaVocalesM = {'A','E','I','O','U'};
        for(int i=0; i<=listaVocalesM.length-1;i++)
        {
            System.out.println("Cuántas veces tiene vocal "+listaVocalesM[i]+"?: "+hileraVector1.cantApariciones(listaVocalesM[i]));
        }
        
        //Apariciones de un caracter determinado
        pCar='L';        
        System.out.println("Cuántas veces tiene "+pCar+"?: "+hileraVector1.cantApariciones(pCar));
        
        //Eliminar
        pCar='A';
        System.out.println("Eliminar "+pCar);
        hileraVector1.eliminarApariciones(pCar);
        pCar = hileraVector1.mostrarHilera();
        while(pCar!='*')
        {
            System.out.print(pCar);
            pCar=hileraVector1.mostrarHilera();
        }
       
        
        
    }
    
}


package Ejercicio1;

public class Ejercicio1 
{
    public static void main(String[] args) 
    {
        String cadena = "Hola, Cata, este es el Ejercicio 1 de Hileras";
        char aCar;
        
        ListaHilera hileraLLCadenaOriginal = new ListaHilera(cadena);
        hileraLLCadenaOriginal.representarStringEnLL();
        
        ListaHilera hileraLLCadenaFinal = new ListaHilera(cadena);
        hileraLLCadenaFinal.representarStringEnLL();
        
        //mostrar Hilera Original
        System.out.println("Cadena original");
        aCar = hileraLLCadenaOriginal.mostrarHileraEnLL();
        while(aCar != '*')
        {
            System.out.print(aCar);
            aCar = hileraLLCadenaOriginal.mostrarHileraEnLL();
        }
        System.out.println();
        
        //Quitar espacios en blanco
        hileraLLCadenaFinal.eliminarEspaciosBlanco();
      
        //mostrar Hilera sin espacios en blanco
        System.out.println("mostrar Hilera sin espacios en blanco");
        aCar = hileraLLCadenaFinal.mostrarHileraEnLL();
        System.out.println("aCar "+aCar);
        while(aCar != '*')
        {
            System.out.print(aCar);
            aCar = hileraLLCadenaFinal.mostrarHileraEnLL();
        }
        System.out.println();
        
        //Reemplazar a por caracter dado
        hileraLLCadenaFinal.cambiarAMinporPar('A');
        //mostrar Hilera sin espacios en blanco
        System.out.println("mostrar Hilera cambio a por A");
        aCar = hileraLLCadenaFinal.mostrarHileraEnLL();
        System.out.println("aCar "+aCar);
        while(aCar != '*')
        {
            System.out.print(aCar);
            aCar = hileraLLCadenaFinal.mostrarHileraEnLL();
        }
        System.out.println();
    }
}

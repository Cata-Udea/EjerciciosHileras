
package Ejercicio9;

public class MainHileras {
    public static void main(String[] args) {
        
        char pCar;
        HilerasEnLL objEnLL1= new HilerasEnLL("Hala comooooo Ffffstas Cata?");
        objEnLL1.representarHileraEnLL();
        
        pCar= objEnLL1.mostrarHileraEnLL();
        while(pCar!='*'){
            System.out.print(pCar);
            pCar=objEnLL1.mostrarHileraEnLL();
        }
        
        System.out.println("\nElimna a's de primera palabra");
        objEnLL1.eliminarCar('a');
        
        System.out.println("\nCuente el nu caracteres de segunda palabra");
        System.out.println("Hay caracteres en la segunda palabra: "+objEnLL1.contarCaracteresSegPal());
        
        System.out.println("\nIntercambia en la tercera palabra");
        objEnLL1.intercambiarTercerPalabra();
        
        pCar= objEnLL1.mostrarHileraEnLL();
        while(pCar!='*'){
            System.out.print(pCar);
            pCar=objEnLL1.mostrarHileraEnLL();
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author catax
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        HilerasEnVector hileraV1 = new HilerasEnVector("ola Chad, como estas");
        hileraV1.representarHileraVector();

        HilerasEnVector hileraV2 = new HilerasEnVector("Colombia no esta en centroamerica");
        hileraV2.representarHileraVector();
        
        HilerasEnVector hileraV3 = new HilerasEnVector("Catalina Casas");
        hileraV3.representarHileraVector();
        
        char aCar;
        
        //Mostrar hilera
        System.out.println("Mostrar hilera 1");
        aCar = hileraV1.mostrarHilera();
        while(aCar != '*')
        {
            System.out.print(aCar);
            aCar=hileraV1.mostrarHilera();
        }
        System.out.println();
        //Ej1
        System.out.println("Cuantas veces se repite la a: "+hileraV1.cuantasVecesCaracterDado('a'));
        System.out.println("Cuantas veces se repite el primer caracter "+hileraV1.cuantasVecesPrimerCar());
        System.out.println("Cuantas veces se repite el ultimo caracter "+hileraV1.cuantasVecesUltCar());
        System.out.println("Cambiando a por A ");
        //Mostrar hilera
        hileraV1.cambioCaracter('a', 'A');
        aCar = hileraV1.mostrarHilera();
        while(aCar != '*')
        {
            System.out.print(aCar);
            aCar=hileraV1.mostrarHilera();
        }
        System.out.println();
        
        
    }
  
    
}

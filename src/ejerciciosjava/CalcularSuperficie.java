/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

/**
 *
 * @author Juan
 */

import java.util.Scanner;

public class CalcularSuperficie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // este algoritmo lee por teclado el radio de un circulo y luego imprime su superficie
        
        //se inicia el scanner
        
        Scanner sc = new Scanner(System.in);
        
        //declaracion de variables
        
        double radio;
        
        System.out.println("ingrese el radio del circulo: ");
        
        radio = sc.nextDouble();
        
        System.out.println("El area del circulo es " + areaCirculo (radio));
        
        System.out.println("El area del circulo con radio = radio*2 es; " + areaCirculo( radio*2));
       
        
    }
    
    
    public static double areaCirculo (double radio)
    {
    // este modulo devuelve la superficie de un circulo cuyo radio es recibido por parametro
        
    //declaracion de variables
        
         double pi = 3.14159265359;
         double area = pi * (radio * radio);
        
        return area;
        
    }
    
}
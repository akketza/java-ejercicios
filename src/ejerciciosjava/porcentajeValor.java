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

public class porcentajeValor {

    public static void main(String[] args) {
        // este algoritmo retorna el porcenaje que representa el primer valor respecto al segundo
        
        //inicio de scanner
        Scanner sc = new Scanner(System.in);
        
        //declaracion de variables
        double parametroUno;
        double parametroDos;
        
        System.out.println("Ingrese el primer valor: ");
        
        parametroUno = sc.nextDouble();
        
        System.out.println("Ingrese el segundo valor: ");
                
        parametroDos = sc.nextDouble();
        
        System.out.println("El % es: " + calculo (parametroUno, parametroDos));
        
    }
    
    
    public static double calculo (double valor1, double valor2){
        //este modulo nos retorna el porcentaje 
        double porcentaje;
        
        porcentaje = valor1 * 100 / valor2;
    
        return porcentaje;
    }
}

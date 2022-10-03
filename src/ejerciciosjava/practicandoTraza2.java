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

public class practicandoTraza2 {
    //parte del programa principal
    public static void main (String[] args){
    //este algotirmo imprime 2 valores dando vuelta los resultados
        
    //inicio de scanner
    Scanner sc = new Scanner(System.in);
    
    //declaracion de variables
    int num1;
    int num2;
    
    //se le pide datos al usuario y se leen
    System.out.println("Ingrese el primer valor: ");
    num2 = sc.nextInt();
    System.out.println("Ingrese el segundo valor: ");
    num1 = sc.nextInt();
    
    //se muestra por pantalla los resultados
    System.out.println("num1 es " + num1 + "y num2 es " +num2);
    }
    
}

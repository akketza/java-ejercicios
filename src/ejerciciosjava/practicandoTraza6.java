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

public class practicandoTraza6 {
    
    //parte del programa princiapl
    public static void main(String[] args){
    //este algoritmo imprime el nombre y la edad de la persona que ingreso los datos
    //inicio de scanner
    Scanner sc = new Scanner(System.in);
    
    //declaracion de variables
    String nombre;
    int edad;
    int fecha;
    
    //se le pide al usuario un dato
    System.out.println("Ingrese su nombre: ");
 
    //leemos el dato
    nombre = sc.nextLine();
    
    //se le pide un dato
    System.out.println("Ingrese su edad: ");
    
    //leemos el dato
    edad = sc.nextInt();
    
    //calculo de la edad
    edad = 2022 - edad;
    
    //se muestra por pantalla el resultado del calculo de la edad
    System.out.println("Su nombre es: " +nombre + "" + "Su año de nacimiento es :" +edad);
    
    }
}

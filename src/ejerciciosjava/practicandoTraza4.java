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

public class practicandoTraza4 {

    //parte principal del programa
    public static void main(String[] args) {
        //este algoritmo imprime un saludo personalizado

        //declaracion de variables
        String nombre;

        //inicio de scanner
        Scanner sc = new Scanner(System.in);

        //se le pide al usuario un dato
        System.out.println("Ingrese su nombre: ");

        //se lee el dato
        nombre = sc.nextLine();

        //se muestra por pantalla el saludo
        System.out.println("HOLA " + nombre + " " + "COMO ESTAS?");
    }
}

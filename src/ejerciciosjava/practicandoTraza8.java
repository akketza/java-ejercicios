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

public class practicandoTraza8 {

    //parte principal del programa
    public static void main(String[] args) {
        //este algoritmo da el doble del numero ingresado

        //inicio de scanner
        Scanner sc = new Scanner(System.in);

        //declaracion de variables
        int numeroIngresado;
        int numeroFinal;

        //pedimos un dato al usuario
        System.out.println("Ingrese un numero: ");

        // se lee el dato del usuario
        numeroIngresado = sc.nextInt();

        //se calcula el cuadrado del numero que ingreso el usuario
        numeroFinal = numeroIngresado * numeroIngresado;

        //se muestra por pantalla el cuadrado del numero que ingreso el usuario
        System.out.println("el cuadrado de " + numeroIngresado + " es " + numeroFinal);

    }
}

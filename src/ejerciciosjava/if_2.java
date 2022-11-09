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

public class if_2 {

    public static void main(String[] args) {
        //este es el segundo ejercicio del Trabajo Practico N4

        //declaracion de variables
        int numeroIngresado;
        //inicio de Scanner
        Scanner sc = new Scanner(System.in);

        //se le pide al usuario un dato
        System.out.println("Ingrese un numero para saber si es par: ");

        //ingreso de dato
        numeroIngresado = sc.nextInt();

        System.out.println(moduloUno(numeroIngresado));
    }

    public static boolean moduloUno(int numeroIngresado) {
        //modulo para hacer el calculo de par o impar
        if (numeroIngresado % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

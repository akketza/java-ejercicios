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

public class if_3 {

    public static void main(String[] args) {
        //este es el ejercicio 3 del Trabajo Practico N4

        //declarion de variables
        int numeroUno, numeroDos;
        String resultado = "";
        //inicio de scanner
        Scanner sc = new Scanner(System.in);

        //se le pide al usuario un dato
        System.out.println("Ingrese el primer numero para saber cual es menor: ");

        //se lee el dato
        numeroUno = sc.nextInt();

        //se le pide al usuario el segundo dato
        System.out.println("Ingrese el segundo numero: ");

        //se le el segundo dato
        numeroDos = sc.nextInt();

        System.out.println(moduloUno(numeroUno, numeroDos, resultado));
    }

    public static String moduloUno(int numeroUno, int numeroDos, String resultado) {
        if (numeroUno == numeroDos) {
            resultado = "Los numeros son iguales";
        } else {
            if (numeroUno < numeroDos) {
                resultado = "El numero: " + numeroUno + " es menor a: " + numeroDos;
            } else {
                resultado = "El numero: " + numeroDos + " es menor a: " + numeroUno;
            }
        }
        return resultado;
    }
}

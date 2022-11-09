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

public class practicandoTraza5 {

    //parte principal del programa
    public static void main(String[] args) {
        //este algotirmo imprime un promedio de notas
        //inicio de scanner
        Scanner sc = new Scanner(System.in);

        //declaracion de variables
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int nota5;
        int notaFinal;

        System.out.println("Este algoritmo imprime su primedio de notas, como maximo 5 notas");

        //se le pide al usuario un dato y lo leemos
        System.out.println("Ingrese su primer nota: ");
        nota1 = sc.nextInt();

        System.out.println("Ingrese su segunda nota: ");
        nota2 = sc.nextInt();

        System.out.println("Ingrese su tercer nota: ");
        nota3 = sc.nextInt();

        System.out.println("Ingrese su cuarta nota: ");
        nota4 = sc.nextInt();

        System.out.println("Ingrese su quinta nota: ");
        nota5 = sc.nextInt();

        //calculo del promedio
        notaFinal = nota1 + nota2 + nota3 + nota4 + nota5 / 5;

        //se muestra por pantalla el promedio de la nota
        System.out.println("Su promedio de nota es: " + notaFinal);
    }
}

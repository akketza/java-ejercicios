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

public class practivandoTraza10 {

    //parte principald del programa
    public static void main(String[] args) {
        //este algo permite saber la superficie a pintar de la casa

        //inicio de scanner
        Scanner sc = new Scanner(System.in);

        //declaracion de variables
        double a, b, c, base, altura, superficie, superfiecieFinal, superPuerta, superVentana;

        //se le pide al usuario un dato
        System.out.println("Ingrese el valor de A en cm: ");
        //se lee el dato
        a = sc.nextDouble();

        //se le pide al usuario un dato
        System.out.println("Ingrese el valor de B en cm: ");
        //se lee el dato
        b = sc.nextDouble();

        //se le pide al usuario un dato
        System.out.println("Ingrese el valor de C en cm: ");
        //se lee el dato
        c = sc.nextDouble();

        //calculos
        base = b + 3 * a;
        altura = c + a + 2 * b;
        superficie = base * altura;
        superPuerta = a * (a + 2 * b);
        superVentana = a * (a + b);
        superfiecieFinal = superficie - (superPuerta + superVentana);

        //se muestra por pantalla el calculo total
        System.out.println("La superficie de la casa a pintar es de: " + superfiecieFinal);
    }
}

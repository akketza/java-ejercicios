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

public class luzSueldo {

    //parte principal del programa
    public static void main(String[] args) {
        // este algotirmo devuelve un porcentaje para pagar la luz del sueldo

        //inicio de scanner
        Scanner sc = new Scanner(System.in);

        //declaracion de varaibles
        double luz;
        double sueldo;

        //se le pide al usuario un dato
        System.out.println("Ingrese el valor de su sueldo: ");

        //se el el dato
        sueldo = sc.nextDouble();

        //se le pide al usuario un dato
        System.out.println("Ingrese el valor de la cuota luz: ");

        //se lee el dato
        luz = sc.nextDouble();

        //se hace el calculo del porcentaje
        double porcentaje = luz * 100 / sueldo;

        //se muestra por pantalla el total del porcentaje
        System.out.println("El porcentaje total es: " + porcentaje);

    }

}

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

public class if_1 {

    public static void main(String[] args) {
        //este algoritmo es el primero del Trabajo Practico N4: Estructuras Alternativas

        //declarion de variables
        int dividendo, divisor;
        int incognita = 0;
        //inicio de Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el numero DIVIDENDO");

        //se le pide dato a usuario
        dividendo = sc.nextInt();

        System.out.println("ingrese el numero DIVISOR");

        divisor = sc.nextInt();

        if (dividendo > 0 && divisor > 0) {
            incognita = dividendo % divisor;
        }

        System.out.println(incognita);
    }
}

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

public class distanciaRecorrida {

    //parte del programa principal
    public static void main(String[] args) {
        //este algoritmo calcula la distancia recorrida en km

        //declaracion de variables
        double km;
        double tiempo;

        //inicio de scanner
        Scanner sc = new Scanner(System.in);

        //se le pide al usuario un dato
        System.out.println("ingrese una velocidad en km/h: ");

        //se lee el dato
        km = sc.nextDouble();

        //se le pide al usuario un dato
        System.out.println("ingrese una cantidad de tiempo en horas: ");

        //se lee el dato
        tiempo = sc.nextDouble();

        //se muestra por pantalla le resultado de la distancia recorrida
        System.out.println("la distancia que recorrio es de :" + calculo(km, tiempo));
    }

    public static double calculo(double km, double tiempo) {
        //este modulo hace el calculo para saber la distancia recorrida

        //declaracion de variables
        double distanciaRecorrida = km * tiempo;

        return distanciaRecorrida;
    }
}

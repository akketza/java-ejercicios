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

public class practicandoTraza11 {

    //parte del programa princial
    public static void main(String[] args) {
        //este algoritmo nos dice la distancia, velocidad y tiempo del avion
        //inicio de scanner
        Scanner sc = new Scanner(System.in);

        //declaracion de variables
        double tiempo, velocidad, distancia, tiempoFinal, velocidadFinal, distanciaFinal;

        //se le pide al usario los datos y se leen
        System.out.println("Ingrese el tiempo: ");
        tiempo = sc.nextDouble();

        System.out.println("Ingrese la velocidad: ");
        velocidad = sc.nextDouble();

        System.out.println("Ingrese la distancia: ");
        distancia = sc.nextDouble();

        //se hacen los calculos
        velocidadFinal = distancia / tiempo;
        tiempoFinal = velocidad / distancia;

        //se muestra por pantalla los resultados
        System.out.println("Su distancia total es: " + calculosAlgoritmo(tiempo, velocidad) + " " + "Su tiempo total es: " + tiempoFinal + " " + "Y su velocidad total es: " + velocidadFinal);

    }

    public static double calculosAlgoritmo(double tiempo, double velocidad) {
        //este modulo hace los calculos para el algoritmo principal

        //declaracion de variables
        double distanciaFinal;

        distanciaFinal = velocidad * tiempo;

        return distanciaFinal;
    }

}

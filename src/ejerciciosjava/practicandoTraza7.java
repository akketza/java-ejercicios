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

public class practicandoTraza7 {

    //parte del programa principal
    public static void main(String[] args) {
        //este algorimo hace pasaje de segundso a horas y minutos
        //inicio de scanner
        Scanner sc = new Scanner(System.in);

        //declaraciones de variables
        int hora, minutos, segundos, segundosIngresados;

        //se le pide al usuario un dato
        System.out.println("Ingrese una cantidad de segundos: ");

        //leemos el dato
        segundosIngresados = sc.nextInt();

        //se hace el calculo
        minutos = segundosIngresados / 60;
        segundos = segundosIngresados % 60;
        hora = minutos / 60;
        minutos = minutos % 60;
        //se muestra por pantalla el resultado
        System.out.println(segundosIngresados + " son " + hora + " hs " + minutos + " min " + segundos + " seg ");

    }
}

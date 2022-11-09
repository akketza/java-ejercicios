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

public class if_8 {

    public static void main(String[] args) {
        //ejercicio N8 del TP N4 RPA REC
        //declarcion de varialbes
        int dia, mes, anio;
        int edad = 0;
        int anioActual = 2022;
        //inicio de Scanner
        Scanner sc = new Scanner(System.in);

        //datos
        System.out.println("Ingrese su dia de cumpleanios en NUMERO: ");
        dia = sc.nextInt();
        System.out.println("Ingrese su mes de cumpleanios en NUMERO: ");
        mes = sc.nextInt();
        System.out.println("Ingrese su anio de cumpleanios en NUMERO: ");
        anio = sc.nextInt();

        System.out.println(moduloCumple(dia, mes, anio, anioActual, edad));
    }

    public static int moduloCumple(int dia, int mes, int anio, int anioActual, int edad) {
        if (mes >= 11 || dia >= 9) {
            edad = ((anioActual - anio) - 1);
        } else {
            edad = anioActual - anio;
        }

        return edad;
    }
}

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

public class if_7 {

    public static void main(String[] args) {
        //ejercicio 7 TP N4 RPA REC

        //declaracion de variables
        int dia, mes, anio;
        String resultado = "El numero de la suerte: ";
        int sumaTotal = 0;
        int primerD = 0;
        int segundoD = 0;
        //inicio de Scanner
        Scanner sc = new Scanner(System.in);

        //datos
        System.out.println("Ingrese el DIA de su cumpleanios en NUMERO: ");
        dia = sc.nextInt();

        System.out.println("Ingrese el MES de su cumpleanios en NUMERO: ");
        mes = sc.nextInt();

        System.out.println("Ingrese el ANIO de su cumpleanios en NUMERO: ");
        anio = sc.nextInt();

        System.out.println(moduloFecha(dia, mes, anio, sumaTotal, resultado));
    }

    public static String moduloFecha(int dia, int mes, int anio, int sumaTotal, String resultado) {
        sumaTotal = (dia + mes + anio) % 100;
        if (sumaTotal > 20) {
            sumaTotal = (sumaTotal / 10) + (sumaTotal % 10);
        }
        return resultado = resultado + sumaTotal;
    }
}

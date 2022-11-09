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

public class if_6 {

    public static void main(String[] args) {
        //ejercicip 6 TP N4 RPA REC

        //declaracion de variables
        int nota1, nota2, recu;
        int notaFinal = 0;
        int notaFinalRecu = 0;

        String nombre = " ";
        String apellido = " ";
        String promocion = " ";

        //inicio de Scanner
        Scanner sc = new Scanner(System.in);

        //ingreso de datos 
        System.out.println("Ingrese su nombre: ");
        nombre = sc.next();

        System.out.println("Ingrese su apellido: ");
        apellido = sc.next();

        System.out.println("Ingrese la primer nota: ");
        nota1 = sc.nextInt();

        System.out.println("Ingrese la segunda nota: ");
        nota2 = sc.nextInt();

        System.out.println("Ingrese nota del recuperatorio, en caso de no haber rendido ponga 0 : ");
        recu = sc.nextInt();

        System.out.println(nombre + " " + apellido + " Su nota es y su estado es : " + " " + moduloNota(nota1, nota2, notaFinal, recu, notaFinalRecu, promocion));
    }

    public static String moduloNota(int nota1, int nota2, int notaFinal, int recu, int notaFinalRecu, String promocion) {

        if ((nota1 + nota2) / 2 >= 80) {
            notaFinal = (nota1 + nota2) / 2;
            promocion = notaFinal + " promocion la materia";

        } else {
            if ((notaFinal + recu) >= 90) {
                notaFinalRecu = (notaFinal + recu);
                promocion = notaFinalRecu + " promociono la materia";
            } else {
                promocion = " no aprobaste nada pibe";
            }

        }
        return promocion;
    }
}

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

public class if_5 {

    public static void main(String[] args) {
        //ejercicio N5 del TPA N4 RPA REC

        //declaracion de variables
        char vocal = ' ';
        String resultado = "";
        //inicio de Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una letra para saber si es vocal: ");
        vocal = sc.next().charAt(0);

        System.out.println(moduloUno(vocal, resultado));
    }

    public static String moduloUno(char vocal, String resultado) {
        switch (vocal) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                resultado = vocal + " es una vocal";
                break;
            default:
                resultado = vocal + " no es una vocal";
        }
        return resultado;
    }
}

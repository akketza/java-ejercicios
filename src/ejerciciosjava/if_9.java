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

public class if_9 {

    public static void main(String[] args) {
        //ejercicio 9 TP N4 RPA REC
        //declaracion de variables
        String mes;
        String resultado = " ";
        //inicio de Scanner
        Scanner sc = new Scanner(System.in);

        //datos usuario
        System.out.println("Ingresa un numero de mes para que aparezca por pantalla: ");
        mes = sc.nextLine();

        System.out.println(moduloMeses(mes, resultado));
    }

    public static String moduloMeses(String mes, String resultado) {
        switch (mes) {
            case "1":
                resultado = "enero";
                break;
            case "2":
                resultado = "febrero";
                break;
            case "3":
                resultado = "marzo";
                break;
            case "4":
                resultado = "abril";
                break;
            case "5":
                resultado = "mayo";
                break;
            case "6":
                resultado = "junio";
                break;
            case "7":
                resultado = "julio";
                break;
            case "8":
                resultado = "agosto";
                break;
            case "9":
                resultado = "septiembre";
                break;
            case "10":
                resultado = "octubre";
                break;
            case "11":
                resultado = "noviembre";
                break;
            case "12":
                resultado = "diciembre";
                break;
            default:
                resultado = mes + "no hay mas de 12 meses pibe";
        }
        return resultado;
    }
}

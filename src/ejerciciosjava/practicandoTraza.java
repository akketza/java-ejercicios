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

public class practicandoTraza {
    //parte del programa principal
    public static void main(String[] args){
    //este algotimo hace una suma
    
    //inicio de scanner
    Scanner sc = new Scanner(System.in);
    
    //declaracion de variables
    int num1, num2, num3;
    
    //se le pide al usuario un dato
    System.out.println("ingrese el primer valor: ");
    
    //se lee el dato
    num1 = sc.nextInt();
    
    //calculos
    num2 = num1 /2;
    
    num3 = num1 + num2;
    
    num1 = num1 % 2;
            
    //salida de resultado del calculo 
    System.out.println("Valor primera variable: " +num1);
    
    System.out.println("Valor segunda y string : " +num2 + " " + "num2");
                
    System.out.println("Valor tercer variable: "+num3);


    }
    
}

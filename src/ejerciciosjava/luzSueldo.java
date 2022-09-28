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

public class luzSueldo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        double luz;
        double sueldo;
        
        System.out.println("Ingrese el valor de su sueldo: ");
        
        sueldo = sc.nextDouble();
        
        System.out.println("Ingrese el valor de la cuota luz: ");
        
        luz = sc.nextDouble();
        
        double porcentaje = luz * 100 / sueldo;
        
        System.out.println("El porcentaje total es: " + porcentaje);
        
    }
    
}

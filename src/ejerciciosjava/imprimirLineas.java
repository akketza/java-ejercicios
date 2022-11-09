
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjava;

/**
 *
 * @author Juan
 */
public class imprimirLineas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // este algoritmo con modulos imprime lineas

        System.out.println(primerLinea());
        System.out.println(segundaLinea());
        System.out.println(tercerLinea());
        System.out.println(cuartaLinea());
        System.out.println(quintaLinea());
        System.out.println(sextaLinea());
        System.out.println(septimaLinea());

        System.out.println("                        ");
        System.out.println("----primer algoritmo----");
        System.out.println("                        ");

        System.out.println(primerLinea());
        System.out.println(quintaLinea());
        System.out.println(segundaLinea());
        System.out.println(sextaLinea());
        System.out.println(segundaLinea());
        System.out.println(sextaLinea());
        System.out.println(segundaLinea());
        System.out.println(quintaLinea());
        System.out.println(primerLinea());

        System.out.println("                         ");
        System.out.println("----segundo algoritmo----");
        System.out.println("                         ");

        System.out.println(primerLinea() + primerLinea());
        System.out.println(quintaLinea() + quintaLinea());
        System.out.println(cuartaLinea() + cuartaLinea());
        System.out.println(tercerLinea() + sextaLinea());
        System.out.println(tercerLinea() + sextaLinea());
        System.out.println(cuartaLinea() + sextaLinea());
        System.out.println(sextaLinea() + cuartaLinea());
        System.out.println(sextaLinea() + quintaLinea());
        System.out.println(sextaLinea() + quintaLinea());
        System.out.println(sextaLinea() + quintaLinea());
        System.out.println(primerLinea() + primerLinea());
    }

    public static String primerLinea() {
        String primerLinea = "+---------------------+";

        return primerLinea;
    }

    public static String segundaLinea() {
        String segundaLinea = "|    +-----------+    |";

        return segundaLinea;
    }

    public static String tercerLinea() {
        String tercerLinea = "|    +-----|-----+    |";

        return tercerLinea;
    }

    public static String cuartaLinea() {
        String cuartaLinea = "|    +-----+-----+    |";

        return cuartaLinea;
    }

    public static String quintaLinea() {
        String quintaLinea = "|                     |";

        return quintaLinea;
    }

    public static String sextaLinea() {
        String sextaLinea = "|    |     |     |    |";

        return sextaLinea;
    }

    public static String septimaLinea() {
        String septimaLinea = "|     |        |      |";

        return septimaLinea;
    }

}

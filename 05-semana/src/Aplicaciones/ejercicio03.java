package Aplicaciones;
import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        byte opcion, edad, costo;
        
        System.out.println("Ingrese su tipo de de análisis \nTipo de analisis 1 (S/. 25.00) : \nTipo de analisis 2 (S/. 36.00) : \nTipo de analisis 1 (S/. 50.00) :");
        opcion = (byte)leerNumero();
        
        System.out.println("Ingrese su edad: ");
        edad = (byte)leerNumero();
        
        costo = opcionEl(opcion);
        
        costoTotal(opcion, edad, costo, edad(edad));
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static byte opcionEl(byte opcion){
        byte costo;
        costo = 0;
        switch (opcion) {
            case 1 -> costo = 25;
            case 2 -> costo = 36;
            case 3 -> costo = 50;
            default -> throw new AssertionError("El valor ingresado por usted no coincide con los dados.");
        }
        return costo;
    }
    static boolean edad(byte edad){
        boolean adicional = false;
        if (edad>=14 && edad<=22){
            adicional = true;
        }
        return adicional;
    }
    static void costoTotal(byte opcion, byte edad, byte costo, boolean adicional){
        System.out.println("Para su analisis " + opcion);
        System.out.println("Su edad siendo de " + edad);
        if (adicional == true ) {
            System.out.println("El coste de su analisis por tener la entre 14 y 22 años es de: " + costo+(costo*0.10f));
        } else {
            System.out.println("El coste de su analisis es de: " + costo);
        }
    }
}
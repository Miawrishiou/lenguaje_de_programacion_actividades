package Aplicaciones;
import java.util.Scanner;
public class Ejercicio05 {
    static float dolar, euro, marco, yen;
    public static void main(String[] args) {
        dolar = 3.30f;
        euro = 3.57f;
        marco = 1.83f;
        yen = 0.03f;
        float opcion, soles;
        opcion = leerNumero1();
        if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 ) {
            if (opcion == 1){
                soles = leerNumero();
                System.out.println("Su dinero a Dolares es: " + solesDolares(soles));
            }
            if (opcion == 2){
                soles = leerNumero();
                System.out.println("Su dinero a Euros es: " + solesEuros(soles));
            }
            if (opcion == 3){
                soles = leerNumero();
                System.out.println("Su dinero a Marcos es: " + solesMarcos(soles));
            }
            if (opcion == 4){
                soles = leerNumero();
                System.out.println("Su dinero a Yenes es: " + solesYenes(soles));
            }
        } else {
            System.out.println("La opcion que ingreso no existe.");
        }
    }
    static float leerNumero1(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("Soles a Dolares [1] \nSoles a Euros [2] \nSoles a Marcos [3] \nSoles a Yenes [4] \nIngrese su opcion: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("Ingrese su cantidad en soles: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float solesDolares(float soles){
        return soles/dolar;
    }
    static float solesEuros(float soles){
        return soles/euro;
    }
    static float solesMarcos(float soles){
        return soles/marco;
    }
    static float solesYenes(float soles){
        return soles/yen;
    }
}

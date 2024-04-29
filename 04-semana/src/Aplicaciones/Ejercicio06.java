package Aplicaciones;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        float tipoAuto, kilometros, dias;
        tipoAuto = leerNumero();
        dias = leerNumero2();
        if (tipoAuto == 1) {
            kilometros = leerNumero1();
            System.out.println("Para su auto pequeño el coste seria: " +  autosPequeños(kilometros, dias));
        }
        if (tipoAuto == 2) {
            kilometros = leerNumero1();
            System.out.println("Para su auto mediano el coste seria: " +  autosMedianos(kilometros, dias));
        }
        if (tipoAuto == 3) {
            kilometros = leerNumero1();
            System.out.println("Para su auto grande el coste seria: " +  autosGrandes(kilometros, dias));
        }
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("Carro Pequeño [1] \nCarro Mediano [2] \nCarro Grande [3] \nIngrese su tipo de auto: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float leerNumero1(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("Ingrese cuantos kilometros ha recorrido el auto: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float leerNumero2(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("Ingrese cuantos dias se alquilo el auto: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float autosPequeños(float kilometros, float dias){
        float total;
        float cons;
        cons = 0.20f;
        total = (15*dias)+(cons*kilometros);
        if (kilometros > 10) {
            total = total+(0.25f*total);
        }
        return total;
    }
    static float autosMedianos(float kilometros, float dias){
        float total;
        float cons;
        cons = 0.30f;
        total = (20*dias)*(cons);
        if (kilometros > 10) {
            total = total+(0.25f*total);
        }
        return total;
    }
    static float autosGrandes(float kilometros, float dias){
        float total;
        float cons;
        cons = 0.40f;
        total = (30*dias)*(cons);
        if (kilometros > 10) {
            total = total+(0.25f*total);
        }
        return total;
    }
}

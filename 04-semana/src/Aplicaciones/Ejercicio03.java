package Aplicaciones;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        float n1, n2, n3, mayor;
        n1 = leerNumero();
        n2 = leerNumero();
        n3 = leerNumero();
        mayor = mayorDeTres(n1, n2, n3);
        imprimir(mayor);
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("ingrese un numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float mayorDeTres(float num1, float num2, float num3){
        float mayor;
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else {
            if (num2 > num1 && num2 > num3) {
                mayor = num2;
            } else {
                mayor = num3;
            }
        }
        return mayor;
    }
    static void imprimir(float mayor){
        System.out.println("El mayor numero es: " + mayor);
    }
}


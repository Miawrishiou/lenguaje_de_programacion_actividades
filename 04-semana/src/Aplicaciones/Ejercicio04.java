package Aplicaciones;
import java.util.Scanner;

public class Ejercicio04 {
    static float max, min;
    public static void main(String[] args) {
        float num1, num2, num3, mid;
        num1 = leerNumero();
        num2 = leerNumero();
        num3 = leerNumero();
        mayorNumero(num1, num2, num3);
        menorNumero(num1, num2, num3);
        mid = medioNumero(num1, num2, num3);
        imprimir(mid);
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("ingrese un numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float mayorNumero(float num1, float num2, float num3){
        max = num1;
        
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        
        return max;
    }
    static float menorNumero(float num1, float num2, float num3){ 
        min = num1;
        
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        
        return min;
    }
    static float medioNumero(float num1, float num2, float num3){
        float mid;
        mid = (num1+num2+num3)-(max+min);
        return mid;
    }
    static void imprimir(float mid){
        System.out.println("El mayor numero es: " + max);
        System.out.println("El menor numero es: " + min);
        System.out.println("El numero del medio es: " + mid);
    }
}

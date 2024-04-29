package Aplicaciones;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        float n1, n2, n3;
        n1 = leerNumero();
        n2 = leerNumero();
        n3 = leerNumero();
        System.out.println("El mayor numero es: " + mayorDeTres(n1, n2, n3));
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("ingrese un numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float mayorDeTres(float num1, float num2, float num3){
        float max;  
        max = num1;
        
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        
        return max;
    }
}

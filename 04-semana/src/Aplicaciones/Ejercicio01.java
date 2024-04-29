package Aplicaciones;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        float num;
        num = leerNumero();
        valorAbsoluto(num);
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("ingrese un numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static void valorAbsoluto(float num){
        if (num < 0) { num = num * -1; }
        System.out.println("el valor absoluto es : " + num);
    }
}

package Aplicaciones;
import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        float consumo, precioT, evaluacion;
        System.out.print("Ingrese el monto del consumo en m³:");
        consumo = leerNumero();
        precioT = precioPorConsumo(consumo);
        evaluacion = consumoE(precioT);
        escribir(evaluacion);
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float precioPorConsumo(float consumo){
        if (consumo>=100) {
            if (consumo>=100 && consumo<=499) {
                consumo = consumo * 0.20f;
            } else {
                if (consumo>499 && consumo<=1000) {
                    consumo = consumo * 0.35f;
                } else {
                    if (consumo>1000) {
                        consumo = consumo * 0.80f;
                    }
                }
            }
        } else {
            consumo = consumo * 0.15f;
        }
        return consumo;
    }
    static float consumoE(float precioT){
        if (precioT>600){
            precioT = precioT + ((precioT*25)/1000);
        }
        return precioT;
    }
    static void escribir(float evaluacion){
        System.out.println("El precio por su consumo es de: " + evaluacion);
    }
}

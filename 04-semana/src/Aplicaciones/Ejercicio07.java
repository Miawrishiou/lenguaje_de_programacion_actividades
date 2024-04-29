package Aplicaciones;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        float horasTrabajadas, pagoPorHora;
        System.out.println("Ingrese las horas trabajadas por el empleado: ");
        horasTrabajadas = leerNumero();
        System.out.println("Ingrese el monto por las horas trabajadas: ");
        pagoPorHora = leerNumero();
        
        if (horasTrabajadas>48){
            System.out.println("El trabajador trabajó mas de 48 horas! El pago que le corresponde es este: " + totalExtraExtra(horasTrabajadas, pagoPorHora));
        } else if(horasTrabajadas>40){
            System.out.println("Considerando que el trabajador trabajo horas extras menores a 48, su sueldo es de: " + totalExtra(horasTrabajadas, pagoPorHora));
        } else{
            System.out.println("EL pago es de: " + totalSimple(horasTrabajadas, pagoPorHora));
        }
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float totalSimple(float horasTrabajadas, float pagoPorHora){
        return horasTrabajadas*pagoPorHora;
    }
    static float totalExtra(float horasTrabajadas, float pagoPorHora){
        float extra;
        extra = horasTrabajadas-40;
        return ((horasTrabajadas-extra)*pagoPorHora)+((pagoPorHora*2)*extra);
    }
    static float totalExtraExtra(float horasTrabajadas, float pagoPorHora){
        float extra, extraExtra;
        extra = 8;
        extraExtra = horasTrabajadas - 48;
        return ((horasTrabajadas-extra-extraExtra)*pagoPorHora)+((pagoPorHora*2)*extra)+((pagoPorHora*3)*extraExtra);
    }
}

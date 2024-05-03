package Aplicaciones;
import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
       float brochas, rodillos, selladores, opcion, totalN;
       
        System.out.println("Ingrese la cantidad de brochas: ");
        brochas = leerNumero();
        
        System.out.println("Ingrese la cantidad de rodillos: ");
        rodillos = leerNumero();
        
        System.out.println("Ingrese la cantidad de selladores: ");
        selladores = leerNumero();
        
        System.out.println("Ingrese el metodo de pago: \nContado[1]: \nCrédito [2]:");
        opcion = leerNumero();
        
        brochas = brochas(brochas);
        rodillos = rodillos(rodillos);
        selladores = selladores(selladores);
        
        imprimir(brochas, rodillos, selladores);
        totalN = brochas+rodillos+selladores;
        opcion(opcion, totalN);
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float brochas(float brochas){
        float precio;
        precio = (brochas * 20)-((brochas * 20)*0.20f);
        return precio;
    }
    static float rodillos(float rodillos){
        float precio;
        precio = (rodillos * 45)-((rodillos * 45)*0.15f);
        return precio;
    }
    static float selladores(float selladores){
        float precio;
        precio = (selladores * 10)-((selladores * 10)*0.05f);
        return precio;
    }
    static void imprimir(float brochas, float rodillos, float selladores){
        System.out.println("El precio por brochas es:" + brochas);
        System.out.println("El precio por rodillos es:" + rodillos);
        System.out.println("El precio por selladores es:" + selladores);
    }
    static void opcion(float opcion, float totalN){
        if (opcion == 1) {
            System.out.println("El total al Contado con descuento es de: " + (totalN-(totalN*0.07F)));
        } else {
            System.out.println("El total al credito es de: " + totalN);
        }
    }
}

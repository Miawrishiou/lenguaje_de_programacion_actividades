package Aplicaciones;
import java.util.Scanner;

public class PracticaCalificada01 {
    public static void main(String[] args) {
        float precioProd, cantidadProd, iC, iCD, iCDD, iDT, iP;
        System.out.println("Ingrese el precio del producto");
        precioProd = leerNumero();
        System.out.println("Ingrese la cantidad de productos");
        cantidadProd = leerNumero();
        
        iC = importeCompra(precioProd, cantidadProd);
        iCD = importeCompraDescuento(iC);
        iCDD = importeCompraDescuentoD(iCD);
        iDT = importeDescuentoT(iCDD, iCD);
        iP = importePagar(iDT, iC);
        
        imprimir(iC, iCD, iCDD, iDT, iP);
    }
    static float leerNumero(){
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.println("Ingrese el numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float importeCompra(float precioProd, float cantidadProd){
        return precioProd * cantidadProd;
    }
    static float importeCompraDescuento(float iC){
        return (iC*7)/100;
    }
    static float importeCompraDescuentoD(float iCD){
        return (iCD*7)/100;
    }
    static float importeDescuentoT(float iCDD, float iCD){
        return iCDD + iCD;
    }
    static float importePagar(float iDT, float iC){
        return iC - iDT;
    }
    static void imprimir(float iC, float iCD, float iCDD, float iDT, float iP){
        System.out.println("----------Reporte----------");
        System.out.println("---------------------------");
        System.out.println("El importe por la compra es: " + iC);
        System.out.println("El importe por el primer descuento es: " + iCD);
        System.out.println("El importe por el segundo descuento es: : " + iCDD);
        System.out.println("El importe por los dos descuentos es: : " + iDT);
        System.out.println("El Total a pagar es: " + iP);
    }
}

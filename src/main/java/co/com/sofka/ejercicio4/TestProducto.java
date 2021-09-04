package co.com.sofka.ejercicio4;

import java.util.Scanner;

public class TestProducto {
    public static void main(String[] args) {
        double precioProducto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de un producto");
        precioProducto = sc.nextDouble();

        Producto producto = new Producto(precioProducto);
        System.out.println("El valor del producto con IVA incluido es de: "+producto.calcularPrecio());

        sc.close();
    }
}

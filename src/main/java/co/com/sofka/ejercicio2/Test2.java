package co.com.sofka.ejercicio2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero a comparar");
        num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero a comparar");
        num2 = sc.nextInt();


        Ejercicio2 miEjercicio = new Ejercicio2(num1,num2);
        System.out.println(miEjercicio.compararNumero());

        sc.close();
    }
}

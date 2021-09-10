package co.com.sofka.ejercicio12;

import java.util.Scanner;

public class TestPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1;
        String palabra2;
        System.out.println("Ingrese la palabra1: ");
        palabra1 = sc.nextLine();

        System.out.println("Ingrese la palabra2: ");
        palabra2 = sc.nextLine();

        Palabras misPalabras = new Palabras(palabra1,palabra2);
        misPalabras.compararPalabras();
        misPalabras.contarIguales();


    }
}

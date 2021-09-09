package co.com.sofka.ejercicio14;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese un número menor que 1000");
            numero = sc.nextInt();
        } while (numero>1000);
        NumerosMayores miNumero = new NumerosMayores(numero);
        miNumero.imprimir();
    }
}

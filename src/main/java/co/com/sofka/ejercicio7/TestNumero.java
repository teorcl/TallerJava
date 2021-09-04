package co.com.sofka.ejercicio7;

import java.util.Scanner;

public class TestNumero {
    public static void main(String[] args) {
        double num;
        Scanner sc = new Scanner(System.in);

        Numero numero = new Numero();

        do {

            System.out.println("Ingrese un número ");
            num = sc.nextDouble();
            numero.setNumero(num);
            if (!numero.comparar()) System.out.println("Numero no valido debe ser 0 o mayor para continuar");

        }while(!(numero.comparar()));
        System.out.println("El numero ingresado es: "+numero.getNumero()+" puedes continuar");

        sc.close();
    }
}

import co.com.sofka.ejercicio1.Ejercicio1;

import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();


        Ejercicio1 ejer = new Ejercicio1(2,3);
        System.out.println(ejer.compararNumero());

        ejer.setVar1(70);
        System.out.println(ejer.compararNumero());

    }
}

package co.com.sofka.ejercicio10;

import java.util.Scanner;

public class TestCorregir {
    public static void main(String[] args) {
        String miCadena;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita una frase que te guste: ");
        miCadena = sc.nextLine();

        CorregirFrase miFrase = new CorregirFrase(miCadena);
        System.out.println(miFrase.elimarEspacio());

        sc.close();
    }
}

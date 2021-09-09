package co.com.sofka.ejercicio11;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class TestFrase {
    public static void main(String[] args) {
        String frase;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita una frase : ");
        frase = sc.nextLine();
        Frase frase1 = new Frase(frase);

        frase1.datosFrase();

        sc.close();
    }
}

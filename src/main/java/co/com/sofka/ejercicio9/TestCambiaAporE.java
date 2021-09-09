package co.com.sofka.ejercicio9;

import java.util.Scanner;

public class TestCambiaAporE {
    public static void main(String[] args) {
        String miFrase;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digita una frase que te guste: ");
        miFrase = sc.nextLine();

        CambiaAporE frase = new CambiaAporE(miFrase);

        System.out.println(frase.getFrase()+"\n");
        System.out.println(frase.unirFrases()+"\n");

        frase.cambiaAPorE();
        sc.close();
    }
}

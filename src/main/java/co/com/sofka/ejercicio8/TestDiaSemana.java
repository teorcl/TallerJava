package co.com.sofka.ejercicio8;

import java.util.Scanner;

public class TestDiaSemana {
    public static void main(String[] args) {
        String dia;
        System.out.println("Ingrese un dia de la semana");
        Scanner sc = new Scanner(System.in);
        dia = sc.nextLine();
        //System.out.println(".");
        DiaSemana diaSemana = new DiaSemana(dia);
        diaSemana.diaLaboral();

    }
}

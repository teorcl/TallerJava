package co.com.sofka.ejercicio15;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        Menu miMenu = new Menu();
        miMenu.mostarMenu();
        do{
            System.out.println("Selecciona una opcion");
            num = sc.nextInt();
            miMenu.setOpcion(num);
            miMenu.selecOpcion();
        }while (miMenu.getOpcion() != 8);
        System.out.println("Gracias por visitar de peliculas");

    }
}

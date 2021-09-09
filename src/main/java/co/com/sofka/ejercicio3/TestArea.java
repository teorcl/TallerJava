package co.com.sofka.ejercicio3;

import java.util.Scanner;

public class TestArea {
    public static void main(String[] args) {
        double radio;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio de un circulo : ");
        radio = Double.parseDouble(sc.nextLine());

        AreaCirculo area = new AreaCirculo();
        area.setRadio(radio);

        System.out.println(area.calcularArea(radio));

    }
}

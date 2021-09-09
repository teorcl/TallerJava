import co.com.sofka.ejercicio1.Ejercicio1;
import co.com.sofka.ejercicio2.Ejercicio2;
import co.com.sofka.ejercicio3.AreaCirculo;

import javax.swing.*;
import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        int num1, num2;
        double r;
        Scanner sc = new Scanner(System.in);

        Ejercicio1 ejer = new Ejercicio1(2,3);
        System.out.println(ejer.compararNumero());

        System.out.println("Ingrese el primer numero a comparar");
        num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero a comparar");
        num2 = sc.nextInt();

        Ejercicio1 ejer2 = new Ejercicio2(num1,num2);
        System.out.println(ejer2.compararNumero());

        //Tercer ejercicio
        //System.out.println("Digita el radio de un circulo para conocer su area");
        r = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio de un circulo para conocer su area"));

        //AreaCirculo area = new AreaCirculo();
       // System.out.println("El area del circulo es: "+area.calcularArea(r));

        sc.close();
    }
}

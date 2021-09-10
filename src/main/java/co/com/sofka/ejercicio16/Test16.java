package co.com.sofka.ejercicio16;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el nombre: ");
        String nombre= sc.nextLine();
        System.out.println("Digite la edad: ");
        int edad= sc.nextInt();
        System.out.println("Digite el sexo: ");
        char sexo= sc.next().charAt(0);
        System.out.println("Digite el peso: ");
        double peso= sc.nextDouble();
        System.out.println("Digite la altura");
        double altura= sc.nextDouble();

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2= new  Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Teo");
        persona3.setEdad(28);
        persona3.setPeso(74.0);
        persona3.setAltura(1.75);
        persona3.setSexo('H');

        System.out.println("Persona 1:");
        System.out.println("Es mayor de edad: "+ persona1.esMayorDeEdad());
        persona1.comprobarPesoIdeal();
        System.out.println(persona1.toString());


        System.out.println("Persona 2:");
        System.out.println("Es mayor de edad: "+ persona2.esMayorDeEdad());
        persona2.comprobarPesoIdeal();
        System.out.println(persona2.toString());


        System.out.println("Persona 3:");
        System.out.println("Es mayor de edad: "+ persona3.esMayorDeEdad());
        persona3.comprobarPesoIdeal();
        System.out.println(persona3.toString());


    }
}

package co.com.sofka.ejercicio17;
import java.util.ArrayList;

public class Test17 {
    private ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();

    private void llenarLista() {
        Electrodomestico electrodomestico1 = new Electrodomestico();
        Electrodomestico electrodomestico2 = new Electrodomestico(40.0, 45.0);
        Electrodomestico electordomestico3 = new Electrodomestico(45.0, "AZUL", 'A', 25.0);
        Electrodomestico electrodomestico4 = new Electrodomestico(30.0, "GRIS", 'B', 15.0);

        Electrodomestico lavadora1 = new Lavadora();
        Electrodomestico lavadora2 = new Lavadora(55.0, 88.4);
        Electrodomestico lavadora3 = new Lavadora(24.0, "BlANCO", 'D', 25.0, 45);

        Electrodomestico televesion1 = new Televisor();
        Electrodomestico television2 = new Televisor(77.0, 12.0);
        Electrodomestico television3 = new Televisor(28.0, "NEGRO", 'F', 15.0, 24, true);

        listaElectrodomesticos.add(electrodomestico1);
        listaElectrodomesticos.add(electrodomestico2);
        listaElectrodomesticos.add(electordomestico3);
        listaElectrodomesticos.add(electrodomestico4);
        listaElectrodomesticos.add(lavadora1);
        listaElectrodomesticos.add(lavadora2);
        listaElectrodomesticos.add(lavadora3);
        listaElectrodomesticos.add(televesion1);
        listaElectrodomesticos.add(television2);
        listaElectrodomesticos.add(television3);

    }

    public void precioFinal() {
        Double totalLavadoras = 0.0;
        Double totalTelevisores = 0.0;
        Double totalElectrodomesticos = 0.0;
        Double total = 0.0;

        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            electrodomestico.precioFinal();
            if (electrodomestico instanceof Electrodomestico) {
                totalElectrodomesticos += electrodomestico.getPrecio();
            }
            if (electrodomestico instanceof Lavadora) {
                totalLavadoras += electrodomestico.getPrecio();
            }
            if (electrodomestico instanceof Televisor) {
                totalTelevisores += electrodomestico.getPrecio();
            }
        }
        total = totalLavadoras + totalElectrodomesticos + totalTelevisores;
        System.out.println("Total ventas: " + total);
        System.out.println("Total televisores: " + totalTelevisores);
        System.out.println("Total lavad: " + totalLavadoras);
        System.out.println("Total televisores: " + totalElectrodomesticos);
    }

    public static void main(String[] args) {
        Test17 main = new Test17();
        main.llenarLista();
        main.precioFinal();

    }
}

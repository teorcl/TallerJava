package co.com.sofka.ejercicio17;

public class Electrodomestico {

    /**----Atributos----**/
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;
    private  final String COLOR_BASE = "blanco";
    private  final char CONSUMO_BASE = 'F';
    private  final double PRECIO_BASE=100.0;
    private  final double PESO_BASE=5.0;

    public Electrodomestico() {
        this.color=COLOR_BASE;
        this.consumoEnergetico=CONSUMO_BASE;
        this.precio=PRECIO_BASE;
        this.peso=PESO_BASE;
    }

    public Electrodomestico(double precio, double peso) {
        this.precio = precio;
        this.peso=peso;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

}



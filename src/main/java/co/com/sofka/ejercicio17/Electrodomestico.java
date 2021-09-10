package co.com.sofka.ejercicio17;

import java.util.Locale;

public class Electrodomestico {

    /**----Atributos----**/
    public final char consumo[] = {'A','B','C','D','E','F'};
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;
    private  final String COLOR_BASE = "BLANCO";
    private  final char CONSUMO_BASE = 'F';
    private  final double PRECIO_BASE = 100.0;
    private  final double PESO_BASE = 5.0;
    private String colores []= {"BlANCO, NEGRO, ROJO,  AZUL, GRIS"};

    public Electrodomestico() {
        this.color=COLOR_BASE;
        this.consumoEnergetico=CONSUMO_BASE;
        this.precio = PRECIO_BASE;
        this.peso = PESO_BASE;

    }

    public Electrodomestico(double precio, double peso) {
        this();
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    private char comprobarConsumoEnergetico(char consumoEnergetico){
        if(consumoEnergetico != consumo[0] && consumoEnergetico != consumo[1] && consumoEnergetico != consumo[2]
                && consumoEnergetico != consumo[3] && consumoEnergetico != consumo[4] && consumoEnergetico != consumo[5])
            return this.CONSUMO_BASE;
        else return consumoEnergetico;
    }

    private String comprobarColor(String color){
        if(color != colores[0] && color != colores[1] && color != colores[2]
                && color != colores[3] && color != colores[4])
            return this.COLOR_BASE;
        else return color;
    }
    public double precioFinal(){
        double precio = this.precio;

        switch (this.consumoEnergetico){
            case 'A':
                this.precio += 100;
                break;
            case 'B':
                this.precio += 80;
                break;
            case 'C':
                this.precio += 60;
                break;
            case 'D':
                this.precio += 50;
                break;
            case 'E':
                this.precio += 30;
                break;
            case 'F':
                this.precio += 10;
                break;
        }

        if(this.peso >= 0 && this.peso <= 19)
            this.precio += 10;
        else if(this.peso >= 20 && this.peso <= 49)
            this.precio += 50;
        else if(this.peso >= 50 && this.peso <= 79)
            this.precio += 80;
        else if(this.peso > 80)
            this.precio += 100;

        return precio;
    }

    public double getPrecio() {
        return precio;
    }
}




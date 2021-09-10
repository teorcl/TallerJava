package co.com.sofka.ejercicio17;

public class Lavadora extends Electrodomestico{
    private final int CARGA_DEFECTO=5;
    private int carga;

    public Lavadora() {
        super();
        this.carga = CARGA_DEFECTO;
    }
    public Lavadora(double precio, double peso) {
        super(precio, peso);
        this.carga=CARGA_DEFECTO;
    }
    public Lavadora(double precio, String color, Character consumoEnergetico, Double peso, Integer carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if(this.carga > 30){
            precioFinal += 50;
        }

        return precioFinal;
    }
}

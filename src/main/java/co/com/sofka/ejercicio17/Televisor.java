package co.com.sofka.ejercicio17;

public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;
    private final int RESOLUCION_DEFECTO = 20;
    private final boolean SINTONIZADORTDT_DEFECTO = Boolean.FALSE;

    public Televisor() {
        super();
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADORTDT_DEFECTO;
    }
    public Televisor(double precio, double peso) {
        super(precio, peso);
        this.resolucion = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADORTDT_DEFECTO;
    }

    public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if(this.resolucion > 40)
            precioFinal = (precioFinal*1.3);
        if(this.sintonizadorTDT)
            precioFinal += 50;

        return  precioFinal;
    }
}

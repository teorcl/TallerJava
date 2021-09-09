package co.com.sofka.ejercicio3;

public class AreaCirculo {
    private double radio;

    //Constructor
    public AreaCirculo(){
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(double radio){
        this.radio = radio;
        return (Math.PI*Math.pow(this.radio,2));
        //System.out.println("El area es: "+Math.PI*Math.pow(this.radio,2));
    }
}

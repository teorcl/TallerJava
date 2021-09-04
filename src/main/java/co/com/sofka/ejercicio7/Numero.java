package co.com.sofka.ejercicio7;

/**
 * 7.Lee un número por teclado y comprueba
 * que este numero es mayor o igual que cero,
 * si no lo es lo volverá a pedir (do while),
 * después muestra ese número por consola.
 * **/

public class Numero {
    /**Atributos**/
    private double numero;

    /**Setters and Getters**/
    public Numero() {
        this.numero = 0;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    /**Comaparar**/
    public boolean comparar(){
        if (this.numero > 0 || this.numero == 0) return true;
        else return false;
    }
}

package co.com.sofka.ejercicio14;

public class NumerosMayores {
    private int numero;

    public NumerosMayores(int numero) {
        this.numero = numero;
    }

    public void imprimir(){
        for(int i = this.numero; i < 1000; i+=2 ){
            System.out.println("i : " + i);
        }
    }
}

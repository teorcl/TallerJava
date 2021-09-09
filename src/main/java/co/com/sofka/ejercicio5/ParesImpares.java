package co.com.sofka.ejercicio5;

/*
* *Muestra los números impares y pares del 1 al 100 (ambos incluidos).
* *Usa un bucle while.
* */

public class ParesImpares {
    /**Atributos*/
    protected int contador;

    public ParesImpares(){
        this.contador = 1;
    }

    public void imprimir() {
        while(true){
            System.out.println("Números Pares");
            while (this.contador <= 100){
                if((this.contador % 2) == 0) System.out.print(this.contador+" ");
                this.contador += 1;
            }
            System.out.println();
            this.contador = 1;
            System.out.println("Números Impares");
            while (contador <= 100){
                if((this.contador % 2) != 0) System.out.print(this.contador+" ");
                this.contador += 1;
            }
            break;
        }
    }
}

package co.com.sofka.ejercicio6;

import co.com.sofka.ejercicio5.ParesImpares;

import java.sql.SQLOutput;

/**
 * Muestra los números impares y pares del 1 al 100 (ambos incluidos).
 * * *Usa un bucle while.
 * */

public class ParImparFor extends ParesImpares {
    public ParImparFor() {
        super();
    }

    @Override
    public void imprimir() {
        System.out.println("Pares");
        for (int i=1; i <= 100; i++){
            if(i %2 == 0) System.out.print(i+" " );
        }
        System.out.println();
        System.out.println("Impares");
        for (int j=1; j <= 100; j++){
            if(j %2 != 0) System.out.print(j+" " );
        }
    }
}

package co.com.sofka.ejercicio12;

import java.util.ArrayList;

public class Palabras {
    /**--------ATRIBUTOS--------**/
    private String palabra1;
    private String palabra2;
    private int contador;

    public Palabras(String palabra1, String palabra2) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
        this.contador = 0;
    }

    public boolean compararPalabras(){
        if(this.palabra1.equals(this.palabra2)) return true;
        else return false;
    }

    public void contarIguales(){
        if(compararPalabras()) System.out.println("Las palabras son iguales");
        else if(this.palabra1.length() >= this.palabra2.length()){
            System.out.println("La palabra "+this.palabra1+" se diferencia de la palabra "+this.palabra2+" en que tiene otras letras :");
            for (int i = 0; i < this.palabra1.length(); i++){
                for (int j = 0; j < this.palabra2.length(); j++){
                    if(this.palabra1.charAt(i) == this.palabra2.charAt(j)) break;
                    else if(this.palabra1.charAt(i) != this.palabra2.charAt(j)) this.contador++;

                    if(this.contador==this.palabra2.length()) System.out.print(this.palabra1.charAt(i));
                }
                this.contador = 0;
            }
        } else {
            System.out.println("La palabra "+this.palabra2+" se diferencia de la palabra "+this.palabra1+" en que tiene otras letras :");
            for (int i = 0; i < this.palabra2.length(); i++){
                for (int j = 0; j < this.palabra1.length(); j++){
                    if(this.palabra2.charAt(i) == this.palabra1.charAt(j)) break;
                    else if(this.palabra2.charAt(i) != this.palabra1.charAt(j)) this.contador++;

                    if(this.contador==this.palabra1.length()) System.out.print(this.palabra2.charAt(i));
                }

                this.contador = 0;
            }
        }

    }

}

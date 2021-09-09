package co.com.sofka.ejercicio10;

/**
 * 10.	Realizar una aplicación de consola, que al ingresar una frase por teclado
 *elimine los espacios que esta contenga.
 * */

public class CorregirFrase {

    /**Atributos*/
    private String cadena;

    public CorregirFrase(String cadena) {
        this.cadena = cadena;
    }

    public String elimarEspacio(){
        return this.cadena.replace(" ","");
    }
}

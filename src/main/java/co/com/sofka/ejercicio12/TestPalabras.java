package co.com.sofka.ejercicio12;

public class TestPalabras {
    public static void main(String[] args) {
        String word = "amor";
        String palabra = "romaIsBeautill";

        Palabras misPalabras = new Palabras(word,palabra);
        //misPalabras.compararPalabras();
        misPalabras.contarIguales();

        Words myWord = new Words(word,palabra);
        myWord.compareWords();

    }
}

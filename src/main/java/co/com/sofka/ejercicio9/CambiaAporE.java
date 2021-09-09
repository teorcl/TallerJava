package co.com.sofka.ejercicio9;

/**
 * 9.Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza
 *todas las a del String anterior por una e, adicionalmente concatenar a
 *esta frase una adicional que ustedes quieran incluir por consola y las
 * muestre luego unidas.
 * */

public class CambiaAporE {
    /**Atributo*/
    private String frase;
    private String frasePropia;

    /**Constructor*/
    public CambiaAporE(String frasePropia) {
        this.frase = "La sonrisa sera la mejor arma contra la tristeza";
        this.frasePropia = frasePropia;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void cambiaAPorE(){
        System.out.println(this.frase.replace("a","e"));
    }

    public String unirFrases(){
        return this.frase +" "+this.frasePropia;
    }
}

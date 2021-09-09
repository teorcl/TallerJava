package co.com.sofka.ejercicio11;

public class Frase {

    /**Atributos*/
    private String miFrase;

    /**Construtor*/
    public Frase(String miFrase) {
        this.miFrase = miFrase;
    }

    public void datosFrase(){
        int a=0,e=0,i=0,o=0,u=0;

        System.out.println("Su frase tiene una longitud de : "+this.miFrase.length());
        for (int j=0 ; j < this.miFrase.length() ; j++){

            if('a'==this.miFrase.charAt(j)) a += 1;
            if('e'==this.miFrase.charAt(j)) e += 1;
            if('i'==this.miFrase.charAt(j)) i += 1;
            if('o'==this.miFrase.charAt(j)) o += 1;
            if('u'==this.miFrase.charAt(j)) u += 1;

        }
        System.out.println("Su frase tiene "+a+" a, "+e+" e, "+i+" i, "+o+" o, "+u+" u");
    }
}

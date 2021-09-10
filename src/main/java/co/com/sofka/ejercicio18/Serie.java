package co.com.sofka.ejercicio18;

public class Serie implements Entregable {

    /**Atributos**/
    private final int TEMPORADA_POR_DEFECTO = 3;
    private final boolean ENTREGADO_POR_DEFECTO = false;
    private String titulo;
    private int numTemporadas;
    private boolean entregado;
    private String generoSerie;
    private String creador;

    public Serie(){
        this.titulo = "";
        this.numTemporadas = TEMPORADA_POR_DEFECTO;
        this.entregado = ENTREGADO_POR_DEFECTO;
        this.generoSerie = "";
        this.creador = "";
    }
    public Serie(String titulo, String creador) {
        this();
        this.titulo = titulo;
        this.creador = creador;
    }
    public Serie(String titulo, String generoSerie, String creador, int numTemporadas) {
        this(titulo,creador);
        this.generoSerie = generoSerie;
        this.numTemporadas = numTemporadas;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getGeneroSerie() {
        return generoSerie;
    }

    public String getCreador() {
        return creador;
    }

    public Integer getNumTemporadas() {
        return numTemporadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGeneroSerie(String generoSerie) {
        this.generoSerie = generoSerie;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setNumTemporadas(Integer numTemporadas) {
        this.numTemporadas = numTemporadas;
    }
    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", Genero Serie='" + generoSerie + '\'' +
                ", creador='" + creador + '\'' +
                ", entregado=" + entregado +
                ", numTemporadas=" + numTemporadas +
                '}';
    }


    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public boolean compareTo(Object a) {
        boolean valueReturn;
        if(this.getNumTemporadas() > ((Serie)a).getNumTemporadas()){
            valueReturn = true;
        }
        else{
            valueReturn = false;
        }
        return valueReturn;
    }
}

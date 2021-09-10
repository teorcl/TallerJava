package co.com.sofka.ejercicio18;

public class VideoJuego implements Entregable{
    private final int HORAS_POR_DEFECTO = 10;
    private final boolean ENTREGADO_POR_DEFECTO = false;
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String generoJuego;
    private String compania;


    public VideoJuego(String titulo, int hours, String generoJuego, String compania){
        this(titulo, hours);
        this.generoJuego = generoJuego;
        this.compania = compania;
    }

    public VideoJuego(String titulo, int hours){
        this();
        this.titulo = titulo;
        this.horasEstimadas = hours;
    }

    public VideoJuego(){
        this.titulo = "";
        this.horasEstimadas = HORAS_POR_DEFECTO;
        this.entregado = ENTREGADO_POR_DEFECTO;
        this.generoJuego = "";
        this.compania = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGeneroJuego() {
        return generoJuego;
    }

    public void setGeneroJuego(String generoJuego) {
        this.generoJuego = generoJuego;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return " Titulo del video juego: '" + titulo + '\'' +
                "\n Horas Estimadas: " + horasEstimadas +
                "\n Entregado: " + entregado +
                "\n Genero: '" + generoJuego + '\'' +
                ",\n Compañia: '" + compania + '\'';
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
        boolean returnValue;

        if(this.horasEstimadas > ((VideoJuego)a).horasEstimadas){
            returnValue = true;
        }else{
            returnValue = false;
        }
        return returnValue;
    }

}

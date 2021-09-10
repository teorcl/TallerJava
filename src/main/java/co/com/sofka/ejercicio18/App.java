package co.com.sofka.ejercicio18;

import java.util.ArrayList;

public class App {
    private  static ArrayList<Serie> serie;
    private  static ArrayList<VideoJuego> videoJuegos;

    public static void main(String[] args) {
        arreglos();
        contar();
    }

    public static void arreglos(){
        Serie serie1 = new Serie();
        Serie serie2 = new Serie("Breaking Bad", "Vince Gilligan");
        serie2.entregar();
        Serie serie3 = new Serie("Game of Thrones", "Accion", "Brian Kirk, D.B.Weiss", 8);
        Serie serie4 = new Serie("Vikingos","Aventura","Michael Hirst",7);
        serie4.entregar();
        Serie serie5 = new Serie("El cartel", "sthephanie");
        serie = new ArrayList(){{add(serie1);add(serie2);add(serie3);add(serie4);add(serie5);}};

        VideoJuego video1 = new VideoJuego();
        VideoJuego video2 = new VideoJuego("Lolsito",18);
        video2.entregar();
        VideoJuego video3 = new VideoJuego("Valorant",14,"Accion","FOX");
        video3.entregar();
        VideoJuego video4 = new VideoJuego("GTA",8);
        VideoJuego video5 = new VideoJuego();
        videoJuegos = new ArrayList(){{add(video1);add(video2);add(video3);add(video4);add(video5);}};
    }

    public static void contar(){
        int contSerie = 0,contVideoJuegos=0,serieMaxima=0,videoHoras=0;
        for (Serie s: serie
        ) {
            if (s.isEntregado())
                contSerie++;
            if (serieMaxima<s.getNumTemporadas())
                serieMaxima = s.getNumTemporadas();
        }
        for (VideoJuego v: videoJuegos
        ) {
            if (v.isEntregado())
                contVideoJuegos++;
            if (videoHoras<v.getHorasEstimadas())
                videoHoras = v.getHorasEstimadas();
        }
        System.out.println("Series Entregadas: "+contSerie);
        System.out.println("Video juegos entregados: "+contVideoJuegos);
        System.out.println("Serie maxima: "+serieMaxima);
        System.out.println("juego con mas horas: "+videoHoras);
    }

}

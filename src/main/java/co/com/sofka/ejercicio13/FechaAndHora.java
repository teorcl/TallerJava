package co.com.sofka.ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaAndHora {
    private LocalDateTime fechaActual;
    private DateTimeFormatter myFormatObj;
    private String formattedDate;

    public FechaAndHora() {
        this.fechaActual = LocalDateTime.now();
        this.myFormatObj = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        this.formattedDate = fechaActual.format(myFormatObj);
    }

    public void mostrarFechaHora(){
        System.out.println("Fecha y hora actual: " + formattedDate);
    }
}




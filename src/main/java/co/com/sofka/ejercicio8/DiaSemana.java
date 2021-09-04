package co.com.sofka.ejercicio8;

/**
 *8.Crea una aplicación por consola que nos pida un día de la semana
 * y que nos diga si es un día laboral o no. Usa un switch para ello.
 * **/

public class DiaSemana {
    /**Atrbutos*/
    String diaDeSemana;

    public DiaSemana(String diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public String getDiaDeSemana() {
        return diaDeSemana;
    }

    public void setDiaDeSemana(String diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public void diaLaboral(){
        switch (this.diaDeSemana){
            case "lunes":
                System.out.println("Los "+this.diaDeSemana+" son días laborales");
                break;
            case "martes":
                System.out.println("Los "+this.diaDeSemana+" son días laborales");
                break;
            case "miercoles":
                System.out.println("Los "+this.diaDeSemana+" son días laborales");
                break;
            case "jueves":
                System.out.println("Los "+this.diaDeSemana+" son días laborales");
                break;
            case "viernes":
                System.out.println("Los "+this.diaDeSemana+" son días laborales");
                break;
            case "sabado":
                System.out.println("Los "+this.diaDeSemana+" no son días laborales");
                break;
            case "domingo":
                System.out.println("Los "+this.diaDeSemana+" no son días laborales");
                break;
            default:
                System.out.println("Debe ingresar un dia de la semana en minusculas");
        }
    }
}

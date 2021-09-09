package co.com.sofka.ejercicio15;

public class Menu {
    /**Atributos*/
    private int opcion;

    public Menu() {
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public void mostarMenu(){
        System.out.println("******* GESTION CINEMATOGRÁFICA ********\n"+
                "1-NUEVO ACTOR\n"+
                "2-BUSCAR ACTOR\n"+
                "3-ELIMINAR ACTOR\n"+
                "4-MODIFICAR ACTOR\n"+
                "5-VER TODOS LOS ACTORES\n"+
                "6-VER PELICULAS DE LOS ACTORES\n"+
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n"+
                "8-SALIR\n");
    }
    public void selecOpcion(){
        switch (this.opcion){
            case 1:
                mostarMenu();
                break;
            case 2:
                mostarMenu();
                break;
            case 3:
                mostarMenu();
                break;
            case 4:
                mostarMenu();
                break;
            case 5:
                mostarMenu();
                break;
            case 6:
                mostarMenu();
                break;
            case 7:
                mostarMenu();
                break;
            default:
                System.out.println("Opción no válida");
                mostarMenu();
                System.out.println("Seleccione una acción");
                break;
        }
    }

}

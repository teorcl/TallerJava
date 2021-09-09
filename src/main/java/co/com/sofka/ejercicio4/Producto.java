package co.com.sofka.ejercicio4;
/**
 *4.Lee un número por teclado que pida el precio de un producto
 * (puede tener decimales) y calcule el precio final con IVA.
 * El IVA sera una constante que sera del 21%.
 * */
public class Producto {
    //Atributos
    private final double IVA = 0.21;
    private double precioProducto;

    /**METODOS*/
    public Producto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double calcularPrecio(){
        return this.precioProducto + (this.precioProducto*IVA);
    }
}

public class Producto {
    private String nombreProducto;
    private String fabricante;
    private double precio;

    public Producto(String nombreProducto, String fabricante, double precio) {
        this.nombreProducto = nombreProducto;
        this.fabricante = fabricante;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPrecio() {
        return precio;
    }

}

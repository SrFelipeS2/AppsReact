import java.util.Date;

public class OrdenDeCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private static int ultimoId;

    private int indiceProducto;

    public OrdenDeCompra(String descripcion) {
        this.id = ++ultimoId;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
        this.indiceProducto = 0;

    }
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }


    public OrdenDeCompra addProducto(Producto productos){
        if(indiceProducto < this.productos.length) {
            this.productos[indiceProducto++] = productos;
        }
        return this;
    }

    public double sumProductos(){
        double sumProductos = 0.0;
        for(Producto producto : productos) {
           if(producto != null){
               sumProductos +=  producto.getPrecio();
           }
        }
        return sumProductos;
    }


}

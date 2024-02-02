import com.avalencia.desafiocatalogoherenciainterface.catalogo.*;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IProducto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        List<IProducto> productos = new ArrayList<>();

        productos.add(new TvLcd("Samsung", 70));
        productos.add(new TvLcd("LG", 55));
        productos.add(new IPhone("Samsung", "Negro espacial", "Galaxy S24"));
        productos.add(new Libro(50000, new Date(98, 4, 20), "Calr Jung", "Obras de Carl Jung", "Los Lagos"));
        productos.add(new Comic(14000, new Date(98, 4, 20), "Autor", "La odisea", "Marvel", "Superman"));
        productos.add(new TvLcd("Samsung", 55));
        productos.add(new TvLcd("LG", 70));

        for (IProducto producto : productos) {
            if (producto != null) {
                producto.mostrarDetalles();
                System.out.println("--------------");
            }
        }
    }
}

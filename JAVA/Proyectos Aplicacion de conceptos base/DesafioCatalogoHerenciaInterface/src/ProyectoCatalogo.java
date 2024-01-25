import com.avalencia.desafiocatalogoherenciainterface.catalogo.Comic;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.IPhone;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.Libro;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.TvLcd;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.clasesabstractas.Producto;
import com.avalencia.desafiocatalogoherenciainterface.catalogo.interfaces.IProducto;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new Producto[7];
        productos[0] = new TvLcd("Samsung", 70);
        productos[1] = new TvLcd("LG", 55);
        productos[2] = new IPhone("Samsung", "Negro espacial", "Galaxy S24");
        productos[3] = new Libro(50000, new Date(98, 4, 20),"Calr Jung","Obras de Carl Jung","Los Lagos");
        productos[4] = new Comic(14000, new Date(98, 4, 20),);
        productos[5] = new TvLcd("LG", 55);
        productos[6] = new TvLcd("LG", 55);

    }
}

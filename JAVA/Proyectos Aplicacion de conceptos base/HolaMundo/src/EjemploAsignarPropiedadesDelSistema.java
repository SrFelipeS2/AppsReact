import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema {
    public static void main(String[] args) {

        try{
            FileInputStream  propierties = new FileInputStream("src/config2.properties");
            Properties p = new Properties(System.getProperties());
            p.load(propierties);
            p.setProperty("mi.propiedad.perzonalizada","Mi valor guardado");

            System.setProperties(p);
            System.out.println("Aqui obtengo una propiedad especifica: " + System.getProperty("mi.propiedad.perzonalizada"));            ;
            System.getProperties().list(System.out);
        }catch(Exception e){
            System.err.println(" No existe el archivo" );
            System.exit(1);
        }

    }
}

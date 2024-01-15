import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese la fecha en formato yyyy-MM-dd");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);
            if(fecha.after(fecha2)){
                System.out.println("Fecha1 del Usuario es despues que fecha2");
            }else if(fecha.before(fecha2)){
                System.out.println("Fecha1 del Usuario es anterior que fecha2");
            }else if (fecha.equals(fecha2)){
                System.out.println("las fechas son iguales");
            }

            if (fecha.compareTo(fecha2)>0){
                System.out.println("Fecha1 del Usuario es despues que fecha2");
            } else if (fecha.compareTo(fecha2)<0) {
                System.out.println("Fecha1 del Usuario es anterior que fecha2");
            } else if (fecha.compareTo(fecha2)==0) {
                System.out.println("las fechas son iguales");
            }


        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.err.println("La fecha tiene un formato Incorrecto: " + e.getMessage());
            System.err.println("El Formato debe ser 'yyyy-MM-dd'");
            //System.exit(1);
            main(args);
        }
    }
}

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(2025,0,20, 16,44,00);
        calendario.set(Calendar.YEAR, 2024);
        calendario.set(Calendar.MONTH, 0);
        calendario.set(Calendar.DAY_OF_MONTH, 12);
        //calendario.set(Calendar.HOUR_OF_DAY, 16);
        calendario.set(Calendar.HOUR, 4);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 49);
        calendario.set(Calendar.SECOND, 00);
        calendario.set(Calendar.MILLISECOND, 100);

        Date fecha = calendario.getTime();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMMM-dd  hh:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}

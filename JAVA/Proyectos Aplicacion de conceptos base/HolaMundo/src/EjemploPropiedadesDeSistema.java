import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);
        
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);
        
        String lineSeprator = System.getProperty("line.separator");
        String lineSeprator2 = System.lineSeparator();
        System.out.println("lineSeprator  = " + lineSeprator2 + "Una linea nueva");

        Properties p = System.getProperties();
        p.list(System.out);
    }
}

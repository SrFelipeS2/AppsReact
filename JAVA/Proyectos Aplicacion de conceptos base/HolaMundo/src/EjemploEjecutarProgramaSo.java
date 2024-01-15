import java.io.IOException;

public class EjemploEjecutarProgramaSo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                proceso = rt.exec("Microsoft VS Code");
            } else if (System.getProperty("os.name").toLowerCase().contains("mac")){
                proceso = rt.exec("open/Applications/TextEdit.app");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                         System.getProperty("os.name").toLowerCase().contains("nix")){
                proceso = rt.exec("open/Applications/TextEdit.app");
            }else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        }catch(Exception e){
                System.err.println("el comando es desconocido" + e.getMessage());
                System.exit(1);
        }
        System.out.println("Se ah cerrado el editor");
        System.exit(0);
    }
}


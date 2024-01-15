import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        
        Map<String, String> variablesDeEntorno = System.getenv();
        System.out.println("variablesDeEntorno = " + variablesDeEntorno);

        System.out.println("Listando variables de entorno");
        for(String key: variablesDeEntorno.keySet()){
            System.out.println(key + " => " + variablesDeEntorno.get(key));
        }

        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);
        
        String javHome = System.getenv("JAVA_HOME");
        System.out.println("javHome = " + javHome);
        
        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        
        String path = System.getenv("Path");
        System.out.println("path = " + path);
        
        String path2 = variablesDeEntorno.get("Path");
        System.out.println("path2 = " + path2);
        
    }
}

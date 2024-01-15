public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Felipe";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Felipe\") = " + nombre.equals("Felipe"));
        System.out.println("nombre.equals(\"felipe\") = " + nombre.equals("felipe"));
        System.out.println("nombre.equalsIgnoreCase(\"felipe\") = " + nombre.equalsIgnoreCase("felipe"));
        System.out.println("nombre.compareTo(\"Felipe\") = " + nombre.compareTo("Felipe"));
        System.out.println("nombre.compareTo(\"Luis\") = " + nombre.compareTo("Luis"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(4,6) = " + nombre.substring(4,6));
        System.out.println("nombre.substring(nombre.length()-3) = " + nombre.substring(nombre.length()-3));

        String trabalengua = "Trabalenguas";
        System.out.println("trabalengua.replace(\"a\",\".\") = " + trabalengua.replace("a","."));
        System.out.println("trabalengua.indexOf(\"a\") = " + trabalengua.indexOf("a"));
        System.out.println("trabalengua.lastIndexOf(\"a\") = " + trabalengua.lastIndexOf("a"));
        System.out.println("trabalengua.indexOf(\"t\") = " + trabalengua.indexOf("lengua"));
        System.out.println("trabalengua.contains(\"l\") = " + trabalengua.contains("lengua"));
        System.out.println("trabalengua.startsWith(\"Traba\") = " + trabalengua.startsWith("Traba"));
        System.out.println("trabalengua.endsWith(\"gua\") = " + trabalengua.endsWith("gua"));
        System.out.println(" Trabalengua ");
        System.out.println(" Trabalengua ".trim());


    }
}

//Los Enum son ideales debido a que nos proporcionan un conjunto de valores constantes fijos
//como opciones o para seleccionar como tipos o categorias
public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 5),
    HATCHBACK("Hatchback", "Auto compacto", 5),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupé", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgón", "Auto utilitario", 3),
    SUV("SUV", "Todo terreno deportivo", 5);

    //Atributos del enum sin estas declaraciones no se pueden declarar estos SEDAN("Sedan", "Auto mediano", 4),

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

//con el constructor se inicializan los valores constantes
    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }
//Estos son metodos de lectura, por que las constantes no tienen metodos setters
    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

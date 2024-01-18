public class Automovil {
    //las clases entidad no lleva nignun Main
//Estos son atributos o caracteristicas
    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private double cilindrada;
    private int capacidadTanque = 40;
    private static int capacidadTanqueEstatico = 40;
    private static int ultimoID;
    //Static es modificador, esto es un atributto de clase, lo que quiere decir que es
    //compartido entre las instancias que tenga el Automovil, para implementar los getters y setters
    //tambien deben de estar declarados como staticos
    private static Color colorPatente = Color.NARANJO;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_VERDE = "Verde";
    public static final String COLOR_BLANCO = "Blanco";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    //Estos son constructores, son un metodo espcial de la clase para definir
//algun proceso de inicializacion que prepare el objeto para ser usado.
//Esto es un constructor vacio que permite crear el objeto sin parametros para ser llenado de manera dinamica
    public Automovil(){
        this.id = ++ultimoID;

    }

    public Automovil(String fabricante, String modelo, Color color) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
    }

    //esto es una sobrecarga de constructores
    public Automovil(String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante,String modelo, Color color, double cilindrada, int capacidadTanque){
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }



    // Esto son funciones o comportamientos, son conocidos como getters y setters
// this hace referencia a la instancia del mismo objeto

    public String getFabricante(){
        return this.fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public Color getColor(){
        return this.color;
    }

    public void setColor(Color color){
        this.color = color;
    }
    public double getCilindrada(){
        return this.cilindrada;
    }
    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque(){
        return this.capacidadTanque;
    }
    public void setCapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }


    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("Auto.Id = " + this.id);
        sb.append(" fabricante = " + this.getFabricante());
        sb.append("\n modelo = " + this.getModelo());
        sb.append("\n color = " + this.color);
        sb.append("\n color Patente = " + Automovil.getColorPatente());
        sb.append("\n cilindrada = " + this.cilindrada);
        return sb.toString();
    }


    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm" ;

    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " Frenando!!";
    }

    public String acelerarFrenar (int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar ;
    }

    public Double calcularConsumo(double kilometraje, double porcentajeGas ){
        return kilometraje/(capacidadTanque * porcentajeGas);

    }

    public float calcularConsumo(int kilometraje, int porcentajeGas ){
        return kilometraje/(capacidadTanque * (porcentajeGas/100F));

    }

    //esto es una funcion estatica y la vamos a iumplementar con un atrributo estatico
    public static float calcularConsumoEstatico(int kilometraje, int porcentajeGas ){
        return kilometraje/(Automovil.capacidadTanqueEstatico * (porcentajeGas/100F));

    }

    //esto tambien es un ejemplo de polimorfismo traemos los metodos que querramos sobreescribir de  la clase padre


    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "Id='" + id + '\'' +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
}

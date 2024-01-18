public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private long identificacion;

    public Cliente(String nombre, String apellido, String direccion, int telefono, long identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public long getIdentificacion() {
        return identificacion;
    }
}

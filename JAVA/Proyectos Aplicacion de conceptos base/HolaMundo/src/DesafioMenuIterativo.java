import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class DesafioMenuIterativo {

   private static Map<String, String> productos = new HashMap<>();

    public static void main(String[] args) {
        int opcionIndice = 0;

        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        do {
            Object[] opArreglo = opciones.keySet().toArray();
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una Opción",
                    "Administrador de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                continue;
            }

            opcionIndice = opciones.get(opcion.toString());

            switch (opcionIndice) {
                case 1:
                    actualizarProducto();
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 3:
                    agregarProducto();
                    break;
                case 4:
                    listarProductos();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Haz salido con éxito!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        } while (opcionIndice != 5);
    }

    private static void agregarProducto() {
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        String descripcionProducto = JOptionPane.showInputDialog("Ingrese la descripción del producto:");
        productos.put(nombreProducto, descripcionProducto);
        JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
    }

    private static void eliminarProducto() {
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto a eliminar:");
        if (productos.containsKey(nombreProducto)) {
            productos.remove(nombreProducto);
            JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }

    private static void actualizarProducto() {
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto a actualizar:");
        if (productos.containsKey(nombreProducto)) {
            String nuevaDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripción del producto:");
            productos.put(nombreProducto, nuevaDescripcion);
            JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Producto no encontrado");
        }
    }

    private static void listarProductos() {
        StringBuilder listaProductos = new StringBuilder("Lista de Productos:\n");
        for (Map.Entry<String, String> entry : productos.entrySet()) {
            listaProductos.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaProductos.toString());
    }
}

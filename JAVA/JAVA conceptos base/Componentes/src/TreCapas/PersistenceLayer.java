package TreCapas;

//PersistenceLayer.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PersistenceLayer {
 private static final String URL = "jdbc:mysql://localhost:3306/persistenciatrescapas";
 private static final String USER = "root";
 private static final String PASSWORD = "";

 public static void saveMessage(String message) {
     System.out.println("Guardando mensaje: " + message);

     try {
         // Establecer la conexión
         Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

         // Preparar la consulta SQL para insertar el mensaje en la tabla
         String sql = "INSERT INTO mensajes (contenido) VALUES (?)";
         PreparedStatement preparedStatement = connection.prepareStatement(sql);
         preparedStatement.setString(1, message);

         // Ejecutar la consulta
         preparedStatement.executeUpdate();

         // Cerrar recursos
         preparedStatement.close();
         connection.close();

         // Mostrar una alerta gráfica
         mostrarAlerta("Mensaje guardado en la base de datos: " + message);
     } catch (SQLException e) {
         e.printStackTrace();
         mostrarAlerta("Error al guardar el mensaje en la base de datos.");
     }
 }

 private static void mostrarAlerta(String mensaje) {
     JOptionPane.showMessageDialog(null, mensaje, "Alerta", JOptionPane.INFORMATION_MESSAGE);
 }
}



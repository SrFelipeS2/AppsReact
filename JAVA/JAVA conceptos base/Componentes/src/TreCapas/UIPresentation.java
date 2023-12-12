package TreCapas;

//UIPresentation.java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIPresentation extends JFrame {
 private JTextField textField;

 public UIPresentation() {
     super("Aplicación de Ejemplo");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     // Crear componentes
     textField = new JTextField(20);
     JButton button = new JButton("Procesar");

     // Configurar el diseño
     setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

     // Añadir componentes al contenedor
     add(new JLabel("Ingrese un mensaje:"));
     add(textField);
     add(button);

     // Configurar la acción del botón
     button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             String userInput = textField.getText();
             ApplicationLayer.processInput(userInput);
         }
     });

     // Configurar el tamaño y la visibilidad de la ventana
     setSize(300, 150);
     setVisible(true);
 }

 public static void main(String[] args) {
     SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
             new UIPresentation();
         }
     });
 }
}

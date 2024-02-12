package com.avalencia.java.jdbc;

import com.avalencia.java.jdbc.model.User;
import com.avalencia.java.jdbc.repository.Repositorio;
import com.avalencia.java.jdbc.repository.UserRepositoryImplementation;

import javax.swing.*;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ExampleJdcUsers {
    public static void main(String[] args) {
        Repositorio<User> repositorio = new UserRepositoryImplementation();
        Map<String, Integer> operaciones = new HashMap();
        operaciones.put("Actualizar", 1);
        operaciones.put("Eliminar", 2);
        operaciones.put("Agregar", 3);
        operaciones.put("Listar", 4);
        operaciones.put("Listar por Id", 5);
        operaciones.put("Salir", 6);

        Object[] opArreglo = operaciones.keySet().toArray();

        boolean continuar = true;

        while (continuar) {
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una Operación",
                    "Mantenedor de Usuarios",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                Integer opcionIndice = operaciones.get(opcion.toString());
                switch (opcionIndice) {
                    case 1:
                        Long idActualizar;
                        do {
                            idActualizar = obtenerLongDesdeInput("Ingrese el ID del usuario a actualizar:");
                        } while (idActualizar == null);

                        String nuevoUsername;
                        do {
                            nuevoUsername = JOptionPane.showInputDialog("Ingrese el nuevo nombre de usuario:");
                        } while (nuevoUsername == null || nuevoUsername.isEmpty());

                        String nuevaPassword;
                        do {
                            nuevaPassword = JOptionPane.showInputDialog("Ingrese la nueva contraseña:");
                        } while (nuevaPassword == null || nuevaPassword.isEmpty());

                        String nuevoEmail;
                        do {
                            nuevoEmail = JOptionPane.showInputDialog("Ingrese el nuevo email:");
                        } while (nuevoEmail == null || nuevoEmail.isEmpty());

                        User uUpdate = new User();
                        uUpdate.setId(idActualizar);
                        uUpdate.setUsername(nuevoUsername);
                        uUpdate.setPassword(nuevaPassword);
                        uUpdate.setEmail(nuevoEmail);
                        repositorio.guardar(uUpdate);
                        JOptionPane.showMessageDialog(null, "Usuario actualizado con éxito");
                        break;
                    case 2:
                        // Eliminar
                        Long idEliminar;
                        do {
                            idEliminar = obtenerLongDesdeInput("Ingrese el ID del usuario a eliminar:");
                        } while (idEliminar == null);
                        repositorio.eliminar(idEliminar);
                        JOptionPane.showMessageDialog(null,"Usuario eliminado");
                        break;
                    case 3:
                        // Agregar
                        User nuevoUsuario = new User();

                        String nombreUsuario;
                        do {
                            nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
                        } while (nombreUsuario == null || nombreUsuario.isEmpty());
                        nuevoUsuario.setUsername(nombreUsuario);

                        String contraseña;
                        do {
                            contraseña = JOptionPane.showInputDialog("Ingrese la contraseña:");
                        } while (contraseña == null || contraseña.isEmpty());
                        nuevoUsuario.setPassword(contraseña);

                        String email;
                        do {
                            email = JOptionPane.showInputDialog("Ingrese el email:");
                        } while (email == null || email.isEmpty());
                        nuevoUsuario.setEmail(email);

                        repositorio.guardar(nuevoUsuario);
                        JOptionPane.showMessageDialog(null,"Usuario guardado con éxito");
                        break;
                    case 4:
                        // Listar
                        StringBuilder listaUsuarios = new StringBuilder("==========Lista de Usuarios=========\n");
                        repositorio.listar().forEach(user -> listaUsuarios.append(user).append("\n"));
                        JOptionPane.showMessageDialog(null, listaUsuarios.toString());
                        break;
                    case 5:
                        // Listar por ID
                        Long idConsultar;
                        do {
                            idConsultar = obtenerLongDesdeInput("Ingrese el ID del usuario a consultar:");
                        } while (idConsultar == null);
                        JOptionPane.showMessageDialog(null, repositorio.porId(idConsultar));
                        break;
                    case 6:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Operación no reconocida");
                }
            }
        }

    }

    private static Long obtenerLongDesdeInput(String mensaje) {
        Long valor;
        try {
            valor = Long.parseLong(JOptionPane.showInputDialog(mensaje));
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
            valor = null;
        }
        return valor;
    }

}

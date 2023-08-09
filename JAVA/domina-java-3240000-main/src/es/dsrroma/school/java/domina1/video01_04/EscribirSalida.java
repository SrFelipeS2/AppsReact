package es.dsrroma.school.java.domina1.video01_04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import es.dsrroma.school.java.domina1.video01_03.Dato;
import es.dsrroma.school.java.domina1.video01_03.LeerEntrada;

public class EscribirSalida {

	public static void main(String[] args) {
		try(
				Scanner s = new Scanner(new File("entrada.txt"));
				FileOutputStream fos = new FileOutputStream("salida.txt")
			) {
			List<Dato> leidos = LeerEntrada.leerDatos(s);
			for (Dato dato : leidos) {
				String linea = dato.getFecha() + ";" + dato.getNombre() + ";" + dato.getSueldo() + "\n";
				fos.write(linea.getBytes());
			}
			System.out.println("Ya está, mira el fichero de salida...");
		} catch (IOException e) {
			System.err.println("Fichero no encontrado");
		}

	}

}

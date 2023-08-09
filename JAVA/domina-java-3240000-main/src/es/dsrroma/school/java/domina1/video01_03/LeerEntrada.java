package es.dsrroma.school.java.domina1.video01_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeerEntrada {
	private static final String PATRON = "dd/MM/yyyy";
	private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern(PATRON);

	public static List<Dato> leerDatos(Scanner s) {
		List<Dato> leidos = new ArrayList<>();
		while (s.hasNextLine()) {
			String linea = s.nextLine();
			String[] datos = linea.split("\t");
			String nombre = datos[0];
			LocalDate fecha = LocalDate.parse(datos[1], DTF);
			int sueldo = Integer.parseInt(datos[2]);
			Dato dato = new Dato();
			dato.setNombre(nombre);
			dato.setFecha(fecha);
			dato.setSueldo(sueldo);
			leidos.add(dato);
		}
		return leidos;
	}

	public static void main(String[] args) {
		try (Scanner s = new Scanner(new File("entrada.txt"))) {
			System.out.println(leerDatos(s));
		} catch (FileNotFoundException e) {
			System.err.println("Fichero no encontrado");
		}
	}
}

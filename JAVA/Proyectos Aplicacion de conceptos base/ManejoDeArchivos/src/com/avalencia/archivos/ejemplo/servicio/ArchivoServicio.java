package com.avalencia.archivos.ejemplo.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){
            buffer.append("Hola Que tal amigos\n").append("Todo bien? estoy escribiendo un archivo\n")
                    .append("Hasta Luego!!\n");

            System.out.println("El Archivo se creo con exito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){
            buffer.println("Hola Que tal amigos");
            buffer.println("Todo bien? estoy escribiendo un archivo");
            buffer.println("Hasta Luego!!");

            System.out.println("El Archivo se creo con exito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (BufferedReader reade = new BufferedReader(new FileReader(archivo));){
            String linea;
            while ((linea = reade.readLine()) != null){
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);

        try (Scanner s = new Scanner(archivo)){
            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}

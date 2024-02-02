package com.avalencia.poointerfaces;

import com.avalencia.poointerfaces.modelo.Cliente;
import com.avalencia.poointerfaces.repositorio.dao.*;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.AccesoDatoexception;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.EscrituraAcessoDatoException;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.LecturaAccesDatoException;
import com.avalencia.poointerfaces.repositorio.dao.excepciones.RegistroDuplicadoAccesoDatoException;
import com.avalencia.poointerfaces.repositorio.dao.lista.ClientetListRepositorio;

import java.util.List;

public class EjemploRepositorioList {
    public static void main(String[] args) {
        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClientetListRepositorio();
            repo.crear(new Cliente("Jano", "Pérez"));
            repo.crear(new Cliente("Bea", "González"));
            repo.crear(new Cliente("Luci", "Martínez"));
            repo.crear(new Cliente("Andrés", "Guzmán"));
            Cliente andres = new Cliente("Andres", "Huarin");
            repo.crear(andres);
            repo.crear(andres);
            // repo.crear(null);
            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);
            System.out.println("===== paginable =====");
            List<Cliente> paginable = repo.listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("===== ordenar =====");
            List<Cliente> ordenable = repo.listar("apellido", Direccion.ASC);
            ordenable.forEach(System.out::println);

            System.out.println("===== editar =====");

            Cliente beaActualizar = new Cliente("Bea", "Mena");
            beaActualizar.setId(2);
            repo.editar(beaActualizar);
            Cliente bea = repo.porId(20);
            System.out.println(bea);
            System.out.println("--------------");
            List<Cliente> andres2 = repo.listar("nombre", Direccion.ASC);
            andres2.forEach(System.out::println);
            System.out.println("-------------");
            repo.eliminar(5);
            repo.listar().forEach(System.out::println);
            System.out.println("---------Total-------");
            System.out.println("total registros: " + repo.total());

        }catch (RegistroDuplicadoAccesoDatoException e){
            System.out.println("Escritura: "+e.getMessage());
            e.printStackTrace();
        }
        catch (LecturaAccesDatoException e) {
            System.out.println("Lectura: "+e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAcessoDatoException e){
            System.out.println("Escritura: "+e.getMessage());
            e.printStackTrace();
        }
        catch (AccesoDatoexception e) {
            System.out.println("Generica: "+e.getMessage());
            e.printStackTrace();
        }
    }
}

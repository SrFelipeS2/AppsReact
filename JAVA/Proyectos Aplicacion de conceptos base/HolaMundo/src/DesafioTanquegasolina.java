import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioTanquegasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double medidaDelEstanque = 0;
        String estado = "";
        String nivelBajo = "El Estanque se encuentra en un nivel Bajo";
        String nivelSuficiente = "El Estanque se encuentra en un nivel Suficiente";
        String nivelMedio = "El Estanque se encuentra en un nivel Medio";
        String nivelTresCuartos = "El Estanque se encuentra en un nivel 3/4";
        String nivelAlto = "El Estanque se encuentra en un nivel Alto, Casi Lleno";
        String lleno = "El Estanque se encuentra totalmente LLeno";
        boolean inputValido = false;
        while (!inputValido) {
            try {
                System.out.println("Ingrese la medida actual del Estanque en Litros: ");
                medidaDelEstanque = s.nextInt();
                inputValido = true;
            } catch (InputMismatchException e){
                System.out.println("Error debe ingresar un número entero!");
                s.nextLine();
            }
        }
        estado = medidaDelEstanque == 70 ? lleno :
                 medidaDelEstanque >= 60 && medidaDelEstanque <= 70 ? nivelAlto :
                 medidaDelEstanque >= 40 && medidaDelEstanque <= 60 ? nivelTresCuartos:
                 medidaDelEstanque >= 35 && medidaDelEstanque <= 40 ? nivelMedio:
                 medidaDelEstanque >= 20 && medidaDelEstanque <= 35 ? nivelSuficiente: nivelBajo;
        System.out.println("estado = " + estado);
    }
}

package es.dsrroma.school.java.domina1.video01_01;

public class Coloreando {
	// más combinaciones en https://en.wikipedia.org/wiki/ANSI_escape_code
	private static final Formato ROJO = 
		new Formato(Color.ROJO, Decorado.NORMAL, Enfasis.NORMAL);
	private static final Formato VERDE_NEGRITA = 
		new Formato(Color.VERDE, Decorado.NEGRITA, Enfasis.NORMAL);
	private static final Formato CIAN_BRILLANTE_SUBRAYADO = 
		new Formato(Color.CIAN, Decorado.SUBRAYADO, Enfasis.BRILLANTE);
	private static final Formato FONDO = 
		new Formato(Color.AMARILLO, Decorado.NORMAL, Enfasis.FONDO);

	public static void main(String[] args) {
		System.out.print("Coloreando... ");
		System.out.print(ROJO + "en rojo" + Formato.RESET);
		System.out.print(VERDE_NEGRITA + "en verde negrita" + Formato.RESET);
		System.out.print(CIAN_BRILLANTE_SUBRAYADO + "azulito" + Formato.RESET);
		System.out.print(FONDO + "fondo" + Formato.RESET);
		System.out.print("normal de nuevo");
		System.out.println();
	}

}

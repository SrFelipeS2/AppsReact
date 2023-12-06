package Matrices;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int[3][3];
		
		//implementacion de Matrices Como las matrices son elementos  con multiples posiciones se llenan usando dos ciclos For uno donde la variable i hace referencia a la ejex y la variable j hace referencia al ejey
		for(int i = 0; i< 3; i ++ ) {			
			for(int j = 0; j < 3; j++) {
				var numero = (j+1)*10;
				matriz[i][j]= numero;			
			}
					
		}
		 for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	
	}

}

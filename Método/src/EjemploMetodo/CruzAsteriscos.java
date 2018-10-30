package EjemploMetodo;

import java.util.Scanner;

public class CruzAsteriscos {

	//MÉTODOS
	
	static int obtenerFC (String fc) {
		Scanner in = new Scanner(System.in);
		int x;
		do {
			System.out.println("numero de " + fc + ": ");
			x=in.nextInt();
			if (x<3 || x % 2 == 0)
				System.out.println("Numero de " + fc + " incorrecto, vuelve a introducir otro numero");
		} while (x < 3 || x%2 == 0);
		return x;
	}
	
	
	public static void main(String[] args) {
		
		int n=obtenerFC("filas");	//INVOCACION AL METODO	 El valor entre comillas es el parametro formal de String fc.
		int m=obtenerFC("columnas");
		
		for (int i = 0; i < n; i++) {
			for (int j=0;j<m;j++) {
				if (i==n/2 || j== m/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}

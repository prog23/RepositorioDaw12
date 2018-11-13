package Ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String cadena1;
		String cadena2;
		
		
		do {
		System.out.println("Escribe la primera cadena: ");
		cadena1=sc.nextLine();
		}while(cadena1.length() == 0);
		do {
		System.out.println("Escribe la segunda cadena: ");
		cadena2=sc.nextLine();
		}while (cadena2.length() == 0 || cadena2.length() > cadena1.length());
		int c = 0;
		int i= -1;
		do {
			i = cadena1.indexOf(cadena2, i + 1);
			if (i >= 0)
				c++;
		}while(i >= 0);
		System.out.println("La segunda esta contenida " + c + " veces en la primera cadena");
	}

}


package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1Version2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		String cadena="";
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		
		System.out.println("Introduce una cadena");
		cadena=sc.nextLine().toLowerCase();
		
		for (int i = 0; i < cadena.length();i++) {
			switch (cadena.charAt(i)) {
			case 'a':
			case 'á':
			contadorA++;
			break;
			case 'e':
			case 'é':
			contadorE++;
			break;
			case 'i':
			case 'í':
			contadorI++;
			break;
			case 'o':
			case 'ó':
			contadorO++;
			break;
			case 'u':
			case 'ú':
			case 'ü':
			contadorU++;
			break;
			}
		}
		System.out.println("La cadena "+ cadena + " tiene " + contadorA +" a.");
		System.out.println("La cadena "+ cadena + " tiene " + contadorE +" e.");
		System.out.println("La cadena "+ cadena + " tiene " + contadorI +" i.");
		System.out.println("La cadena "+ cadena + " tiene " + contadorO +" o.");
		System.out.println("La cadena "+ cadena + " tiene " + contadorU +" u.");

	}

}

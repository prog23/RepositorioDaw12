package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

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
			
			char c= cadena.charAt(i);
			
			if (c=='a' || c =='á') {
				contadorA++;
			}
			else if (c=='e' || c== 'é') {			
				contadorE++;			
				
			}	
			else if (c=='i' || c== 'í') {
				contadorI++;
			}
			else if (c=='o' || c== 'ó') {
				contadorO++;
			}
			else if (c=='u' || c== 'ú' || c=='ü') {
				contadorU++;
			}
			
		}
		
		System.out.println("La cadena "+ cadena + " tiene " + contadorA +" a.");
		System.out.println("La cadena "+ cadena + " tiene " + contadorE +" e.");
		System.out.println("La cadena "+ cadena + " tiene " + contadorI +" i.");
		System.out.println("La cadena "+ cadena + " tiene " + contadorO +" o.");
		System.out.println("La cadena "+ cadena + " tiene " + contadorU +" u.");
		
	}

}

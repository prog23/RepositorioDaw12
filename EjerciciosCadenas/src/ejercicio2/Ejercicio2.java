package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		String invertir="";
		String cadenainvertida="";
		
		System.out.println("Introduce una cadena");
		invertir=sc.nextLine().toLowerCase();
		
		
		for (int i = invertir.length()-1;i>=0;i--) {
			cadenainvertida=cadenainvertida+invertir.charAt(i);
		}
		
		System.out.println(cadenainvertida);

	}

}

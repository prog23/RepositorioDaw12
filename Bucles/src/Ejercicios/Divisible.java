package Ejercicios;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
	
		System.out.println("┐Comprobar si un numero es divisible entre otro?(si/no)");
		String respuesta=in.next();
		
		while (respuesta.equals("si".toLowerCase())) {
			
			System.out.println("Introduce x");
			int x=in.nextInt();
			
			System.out.println("Introduce y");
			int y=in.nextInt();
			
			if (x % y==0) {
				System.out.println(x+" es divisible entre "+y);
			}
			else 
				System.out.println(x+" no es divisible entre "+y);
				
			System.out.println("┐Comprobar si un numero es divisible entre otro (si/no)");
			respuesta=in.next();
			
		}

	}

}

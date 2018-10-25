package ejer2;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
	  Scanner teclado=new Scanner(System.in);
		int z;		
		System.out.println("Introduce Z: ");
		z=teclado.nextInt();		
		if (z%2==0) 
			System.out.println(z+" es par");
		else 
			System.out.println(z+" es impar");		

	}

}

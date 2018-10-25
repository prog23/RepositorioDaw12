package ejer3;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int x;
		int y;
		int total;
		
		System.out.println("Introduce x");
		x=teclado.nextInt();
		System.out.println("Introduce y");
		y=teclado.nextInt();
		
		if (x % y==0) {
			System.out.println(x+" es divisible entre "+y);
			total=x/y;
			System.out.println("El resultado de la división es "+total);
		}
		else {
			System.out.println(x+" no es divisible entre "+y);
		}
	}

}

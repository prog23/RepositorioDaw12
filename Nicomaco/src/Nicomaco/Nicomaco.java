package Nicomaco;

import java.util.Scanner;

public class Nicomaco {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce Número interno ");
			int n= sc.nextInt();
			int impar = 1;		
	
		
			for (int i = 1; i <= n; i++) {
				int acumulador = 0;
				System.out.print(i + "^3 = ");
				for (int m = 1; m <= i; m++) {
					System.out.print(impar + ((m != 1)? " + ": ""));
					acumulador += impar;
					impar += 2;
			
				}	
				System.out.println(" = " + acumulador);
			}
			

	}

}


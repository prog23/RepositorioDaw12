package Triangulo;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a;
		int b;
		int c;
		
			System.out.println("Inserte lado a: ");
			a=sc.nextInt();
			
			System.out.println("Inserte lado b: ");
			b=sc.nextInt();
			
			System.out.println("Inserte lado c: ");
			c=sc.nextInt();
		
				if (a<b+c && b<a+c && c<a+b) {
					System.out.println("Tri�ngulo v�lido");
						if (a == b && a==c) {
						System.out.println("Es equil�tero");
					}else
						if (a == b && a!=c) {
							System.out.println("Es Is�sceles");
						}else
						if (a!=b && a!=c && c!=b) {
							System.out.println("Es Escaleno");
						}
				}else {
					System.out.println("Triangulo no v�lido");
				}
										

	}

}

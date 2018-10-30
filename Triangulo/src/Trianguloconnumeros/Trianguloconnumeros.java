package Trianguloconnumeros;

import java.util.Scanner;

public class Trianguloconnumeros {

	public static void main(String[] args) {
	
		
		for (int i=1 ; i<=10 ; i++) {
			int n= i % 10;
			int espacios= 10 - i;
			int digitos= i + i - 1;
			
					for (int j = 0; j < espacios; j++) 
						System.out.print(" ");
					
					for (int y = 0; y < digitos; y++) {
						if (y >= digitos/2) {
							if(n < 0)
								n = 9;
						System.out.print(n--%10);
						
						}	else if (y <= digitos/2) {
							
						System.out.print(n++%10);
						
						}
						
					}
					System.out.println();	
					}
				
					
		
			
				}
			}
		

	

/*
 Lineas =1 -> for i=1;for=10
 n=1%10   	n%10; (sirve para conseguir el 0 final)
 Espacios= 10-i;
 Digitos= i+i-1
  
 
 */


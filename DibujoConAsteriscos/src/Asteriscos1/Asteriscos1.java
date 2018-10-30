package Asteriscos1;

public class Asteriscos1 {

	
	static void volcan (int h) {
		
		int asteriscos=2;
		int espacios;
		int total = (int)Math.pow(2, h)/2;
		
		for (int i=0; i<h; i++) {
			
			for(int j = 0;j < asteriscos;j++) {
				System.out.print(" ");
			}
			
			for (int j=0;j < asteriscos; j++) {
				System.out.print("*");
				
			}
			asteriscos += asteriscos;
			System.out.println();
			}
		
	}
	
	public static void main(String[] args) {	
		

	}

}

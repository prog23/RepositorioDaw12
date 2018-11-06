package Asteriscos1;

public class Asteriscos1 {

	
	static void volcan (int h) {
		
		int asteriscos=2;
		int espacios = 2;
		int total = (int)Math.pow(2, h)/2;
		
		for (int i=0; i<h; i++) {
			
			for(int j = 0;j < espacios;j++) {
				System.out.print(' ');
			}
			
			for (int j = 0; j < asteriscos; j++) {
				System.out.print('*');
				
			}
			total=asteriscos += asteriscos;
			System.out.println();
			}
	
		
	}
	
	static void mosaico(int f, int c) {
		for (int i=0; i<f; i++) {
			for (int j=0; j<c; j++) {
				if((j % 2 == 0 && i % 2 != 0) || (j % 2 != 0 && i % 2 == 0))
					System.out.print('*');
					else
						System.out.print(' ');				
				
			}
			System.out.println();
			
		}
		
		//g
		
	}
	
	static void tablero (int f, int c, int l) {
		for (int i = 0; i < f; i++) {
			for (int j = 0; j < l; j++) {
				for (int z=0; z<c; z++) {
					
					if ((i % 2 == 0 && z % 2 !=0) || (i % 2 !=0 && z % 2 == 0)) 
						System.out.print("*****");
					else 
						System.out.print("     ");
					}
					
					System.out.println();
					
				}
				
			}
			
		}
		
	static void tableroDos (int f, int c, int l) {
		int ctxt = c * l;
		int ftxt = f * l;
		for (int i = 0; i < ftxt; i++) {
			for (int j = 0; j < ctxt; j++) {
				int ctab = j / l;
				int ftab = i / l;
				if ((ftab % 2 == 0 && ctab % 2 !=0) || (ftab % 2 !=0 && ctab % 2 == 0)) 
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {	
		
		volcan(6);
		mosaico (10 ,10);
		tablero(6, 9, 3);
		tableroDos(6, 9, 3);

	}

}

package Cadenas;

public class Cadena1 {

	public static int countYZ(String str) {
		  str = str.toLowerCase();
		  int l = str.length();
		  int cont = 0;
		  int i;
		  for (i = 0; i < l; i++)
		    {
		    char c = str.charAt(i);
		    if ((c == 'y' || c =='z') && (i == l - 1 || !Character.isLetter(str.charAt(i + 1))))
		     {
		       cont++;
		       
		     } 
		    }
		    return cont;
		}
	
	public static void main(String[] args) {
		
		System.out.println(countYZ("feliz day"));

	}

}

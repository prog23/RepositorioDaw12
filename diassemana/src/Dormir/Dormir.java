package Dormir;

public class Dormir {

	
	public static boolean Madrugar (boolean laboral,boolean vacaciones) {		
		
		if (laboral == false || vacaciones == true)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		
		Madrugar(false, false);
		

	}

}

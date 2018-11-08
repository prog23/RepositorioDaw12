
public class PruebaString {

	public static String extraEnd(String str) {
		
		  int l = str.length();
		  String s =  str.substring(l - 2);
		  return s + s + s;
		}
	
	public static void main(String[] args) {
		System.out.println(extraEnd("Hello"));
	

	}

}

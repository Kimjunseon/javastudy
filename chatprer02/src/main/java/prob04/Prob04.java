package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray( c1 );

		char[] c2 = reverse("Java Programming!");
		printCharArray( c2 );
		
	}	
	
	public static char[] reverse(String str) {
		char[] charArrary = str.toCharArray();
		return charArrary;
	}

	public static void printCharArray(char[] array){
		for(int i = array.length - 1; i >= 0 ; i--) {
			System.out.print( array[i] );
		}System.out.println("");
	}
}

package chapter04;

public class StringTest02 {
	
	public static void main(String[] args) {
		// immutability(불변성)
		String s1 = "adc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@");
		
		
		
		System.out.println(s2);
		System.out.println(s4);
		System.out.println(s5);
		
		String s6 = null;
		System.out.println(equalsHello(s6));
	}
	private static boolean equalsHello(String s) {
		return "Hello".equals(s);
	}
		
		
	}


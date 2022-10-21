package chapter01;

/*
 * 리터널(literal)이란 프로그램에 직접적으로 표현되는 상수 
 */
public class Ex02Literal {

	public static void main(String[] args) {
		float f = 3.14f; // float(4바이트)는 double(8바이트)로 인식 8바이트가 4바이트로 인식을 함 f를 붙여 4바이트를 부여
		double d = 3.14;
		
		short s = 1;
		int i = 1;
		long l = 1234567890; // long은 int 판정 더 큰수를 표현하려면 L을 넣어준다.
		
		char c = 'A';
		byte b = 65;
		
		boolean bool = true;
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(c);
		System.out.println((char)b); // ANSI 코드
		
		System.out.println(bool);
			
	}

}

package chapter01;

public class Ex01Variable {

	public static void main(String[] args) {
		int i = 1000;
		String s = "Hello World";
		// String은 객체지만 자료형 변수로 사용됨
		
		System.out.println(i);
		System.out.println(s);
				
		System.out.println("변수 변경");
		i = 2000;
		s = "Hello Again";
		
		System.out.println(i);
		System.out.println(s);
		// 원래라면 String은 변경 시 원래 있던 값에 접근을 하지 못해 가비지 값이 되지만 자바에서는 청소됨
		
	}

}

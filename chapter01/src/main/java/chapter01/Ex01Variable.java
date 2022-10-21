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
		
		
		// 상수(constant) fianl
		// 고정된 데이터 값 (변경이 불가)
		// 관례상 문자를 대문자로 표기
		final double PI = 3.14;
		System.out.println(PI);
		// 오류
		// final이 붙은 변수(상수)는 다시 값을 대입하면 오류 pi = 5.5
		
		
		
	}

}

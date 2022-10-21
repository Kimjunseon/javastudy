package chapter01;

public class Ex23PowerOfTwo {

	public static void main(String[] args) {
		int result = 1;
		
		for(int i = 1; i <= 10; i = i+1) {
			result = 2 * result;
			System.out.println("2의 " + i + " 제곱근은 " + result + "입니다.");
		}
	
	}

}
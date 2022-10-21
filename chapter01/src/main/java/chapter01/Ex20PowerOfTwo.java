package chapter01;

public class Ex20PowerOfTwo {

	public static void main(String[] args) {
		final int POWER = 10;
		int result = 1;
		int i = 0;
		
		while(i < POWER) {
			result = 2 * result;
			i++;
			System.out.println("2의 " + i + "제곱근은 "+ result +"입니다.");
		}
		

	}

}

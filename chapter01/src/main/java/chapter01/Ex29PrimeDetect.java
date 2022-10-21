package chapter01;

public class Ex29PrimeDetect {

	public static void main(String[] args) {
		// 2 ~ 1000까지 소수를 화면에 출력하세요.
		
		int num = 8;
		boolean isPrime = true;
		
		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + "는 소수가 아닙니다.");
				break;
			} else {
				System.out.println(num + "는 소수입니다.");
				}
			}
	}
}		
//		if(isPrime) {
//			System.out.println(num + "는 소수입니다.");
//			System.out.println(num + "는 소수가 아닙니다.");
//		}



package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.print("수를 입력하십시오: ");
		int value = scanner.nextInt();
		
		if(value % 3 == 0) {
			System.out.print("3의 배수입니다.");
		} else {
			System.out.print("3의 배수가 아닙니다.");
		}
		
		scanner.close();
	}
}

package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[ 5 ];
		double sum = 0;
		
		System.out.println(intArray.length +  "개의 숫자를 입력하세요");
		for(int i = 0; i < intArray.length; i++) {
			int value = scanner.nextInt();
			intArray[i] = value;
			sum = sum + intArray[i]; 
		} System.out.println("평균: " + sum / intArray.length);
		scanner.close();
	}
}

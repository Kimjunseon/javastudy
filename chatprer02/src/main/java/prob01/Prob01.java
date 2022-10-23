package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수를 입력하십시오: ");
		int inputMoneys = scanner.nextInt();

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		for(int i = 0; i <= MONEYS.length -1; i++) {
				int outPutmoney = inputMoneys / MONEYS[i];
				System.out.println(MONEYS[i] + "원:" + outPutmoney + "개");
			for(int j = 0; j <= i; j++) {
				inputMoneys = inputMoneys % MONEYS[j];
			}
		}
		scanner.close();
 	}
}
package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		while( true ) {
			/* 게임 작성 */
			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
			System.out.println("지정 숫자: " + correctNumber);
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			
			
			int minValue = 0;
			int maxValue = 100;
			int count = 0;
			
			System.out.println("1 ~ 100");
			System.out.print(count + ">>");
			int value = scanner.nextInt();
			
			
			while (true) {
				if(correctNumber > value) {
					count++;
					minValue = value;
					System.out.println(minValue + " ~ " + maxValue);
					System.out.println("더 높게");
					System.out.print(count + ">>");
					value = scanner.nextInt();
				} else if(correctNumber < value) {
					count++;
					maxValue = value;
					System.out.println(minValue + " ~ " + maxValue);
					System.out.println("더 낮게");
					System.out.print(count + ">>");
					value = scanner.nextInt();
				} else if(correctNumber == value) {
					break;
					}
				}
			
		if(correctNumber == value) {
			System.out.print( "다시 하겠습니까(y/n)>> " );
			String answer = scanner.next();
			if("y".equals(answer) == false) {
				scanner.close();
				break;
			}
		}

		}
			
	}
}

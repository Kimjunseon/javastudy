package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		int textLength = text.length();
		
		for(int i = 1; i < textLength+1; i++) {
			System.out.print(text);
			for(int j = 2; j <textLength; j++) {
				System.out.print(" ");
				
			}System.out.print("\n");
		}
		
		
		scanner.close();
	}

}

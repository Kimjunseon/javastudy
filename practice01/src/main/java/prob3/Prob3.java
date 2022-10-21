package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수를 입력하십시오: ");
		int value = scanner.nextInt();
		int result = 0;
		
		if(value % 2 == 0) {
			for(int i = 1; i < value+1; i++) {
				if (i % 2 == 0) {
					result = i + result; 
				}
			}System.out.print(result);
		
		} else if(value % 2 == 1) {
			for(int i = 1; i < value+1; i++) {
				if (i % 2 == 1) {
					result = i + result;
				}
			}System.out.print(result);
		 }
	}
}
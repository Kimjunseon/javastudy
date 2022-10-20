package chapter01;

public class EX14IfStatement {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		int temp = 0;
		
		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		System.out.println("---초기값---");
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		if (n1 < n2) {
			// swap
			temp = n1;
			n1 = n2;
			n2 = temp;
			System.out.println("---결과값---");
			System.out.println("n1: " + n1);
			System.out.println("n2: " + n2);
			System.out.println("----------");
		}
			
		
		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 30;
		int a2 = 20;
		int a3 = 40;
		
		if(a1 > a2) {
			if (a3 > a1) {
				System.out.println("최댓값: " + a3);
			} else {
			System.out.println("최댓값: " + a1);
			}
		}else {
			if(a3 > a2) {
				System.out.println("최댓값: " + a3);
			}else {
				System.out.println("최댓값: " + a2);
			}
			}
		
		
//		if (((a1 >= a2) && (a1 >= a3)) == true){
//			System.out.println("최댓값: " + a1);
//			} else if(((a2 >= a1) && (a2 >= a3)) == true){
//				System.out.println("최댓값: " + a2);
//			} else if(((a3 >= a1) && (a3 >= a2)) == true){
//				System.out.println("최댓값: " + a3);
//			}
		}
		}
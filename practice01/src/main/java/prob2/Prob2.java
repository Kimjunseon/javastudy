//package prob2;
//
//public class Prob2 {
//	public static void main(String[] args) {
//		for(int i = 1; i < 9; i++) {
//			System.out.print(i);
//			System.out.print(" ");
//			for(int j = 1; j < 10; j++) {
//				System.out.print(i+j);
//				System.out.print(" ");
//			}System.out.print("\n");
//		}
//			
//	}
//}

package prob2;

public class Prob2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j < i + 10; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
}
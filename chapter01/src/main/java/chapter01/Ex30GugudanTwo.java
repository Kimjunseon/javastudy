package chapter01;

public class Ex30GugudanTwo {

	public static void main(String[] args) {
		// 출력순서가 1X1 2X1 3X1 4X1 5X1 6X1 7X1 8X1 9X1
		// System.out.println("1 X 1 = 1");
		// System.out.println("1 X 1 = 1");	
		// System.out.print("1 X 1 = 1");
		// System.out.print("\t");
		// System.out.print("2 X 1 = 1");
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(j + "X" + i + "=" + i*j);
				System.out.print("\t");
				}
			System.out.print("\n");
			}
	}
}



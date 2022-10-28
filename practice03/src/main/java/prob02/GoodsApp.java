package prob02;

import java.util.Arrays;
import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		String line = scanner.nextLine();
		String[] infos = line.split(" "); // 배열로 표시 공백은 분리
		
		String line2 = scanner.nextLine();
		String[] infos2 = line2.split(" ");
		// System.out.println(Arrays.toString(infos));
		
		String name = infos[0];
		int price = Integer.parseInt(infos[1]);
		int count = Integer.parseInt(infos[2]);
		
//		goods.setName();
//		goods.setPrice(123);
//		goods.setCount(name);
		
		// 상품 출력
		System.out.println(name +  price + count);
		// 자원정리
		scanner.close();
	}

}

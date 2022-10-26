package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods(); // Goods()는 기본 생성자
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		camera.showInfo();
		
		int discountPrice = camera.calDiscountPrice(0.5);
		System.out.println("Discount Price: " + discountPrice);
		
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		Goods g3 = new Goods();
		
		System.out.println("instance count:"  + Goods.countOfGoods);
		
		// 생성자 초기화
		Goods g4 = new Goods("Tv", 10000, 10 ,0);
		g4.showInfo();
		System.out.println("instance count:"  + Goods.countOfGoods);
	}
}

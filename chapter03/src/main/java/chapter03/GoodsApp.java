package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods(); // Goods()는 기본 생성자
		System.out.println("instance count:"  + Goods.countOfGoods);
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		System.out.println("instance count:"  + Goods.countOfGoods);
		camera.setCountSold(50);
		
		camera.showInfo();
		
		int discountPrice = camera.calDiscountPrice(0.5);
		System.out.println("Discount Price: " + discountPrice);
		System.out.println("instance count:"  + Goods.countOfGoods);
		Goods g1 = new Goods();
		Goods g2 = new Goods();
		Goods g3 = new Goods();
		
		System.out.println("instance count:"  + Goods.countOfGoods);
		
		// 생성자 초기화
		Goods g4 = new Goods("Tv", 10000, 10 ,0);
		g4.showInfo();
		System.out.println("instance count:"  + Goods.countOfGoods);
		
		// object부터 불러 옴 
		System.out.println(g4.toString());
	
		System.out.println(g4);
	}
}

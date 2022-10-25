package chapter03;

public class Goods {
		public static int countOfGoods = 0;
		private String name;
		private int price;
		private int countStock;
		private int countSold;
		
		public Goods() {
			countOfGoods++; // Goods.는 생략가능 Goods.countOfGoods++;
		}
		
		public void setName(String name) {
			this.name = name; // this.name은 위에 Goods-name setName 내부의 있는 name은 바로 위 name 
		}
		public String getName() {
			return name; // this. 붙힐수 있고 생략가능
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getCountStock() {
			return countStock;
		}
		public void setCountStock(int countStock) {
			this.countStock = countStock;
		}
		public int getCountSold() {
			return countSold;
		}
		public void setCountSold(int countSold) {
			this.countSold = countSold;
		}
		public String toString() {
			return "name: " + name + " price: " + price + " countStock: " + countStock + " countSold: " + countSold; 
		}
}


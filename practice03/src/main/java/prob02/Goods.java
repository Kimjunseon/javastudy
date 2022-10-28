package prob02;

public class Goods {
//	private String drinkName;
//	private int drinkPrice;
//	private int drinkCount;
	private String goods[0];
	private String goods[0];
	private String goods[0];
	
	
	public Goods(String name, int price, int count) {
		this.drinkName = name;
		this.drinkPrice = price;
		this.drinkCount = count;
	}

	public void showInfo() {
		System.out.println(this.drinkName + "(가격:" +
						   this.drinkPrice + "원)이 " +
					       this.drinkCount + "개 입고 되었습니다.)");
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public int getDrinkPrice() {
		return drinkPrice;
	}

	public void setDrinkPrice(int drinkPrice) {
		this.drinkPrice = drinkPrice;
	}

	public int getDrinkCount() {
		return drinkCount;
	}

	public void setDrinkCount(int drinkCount) {
		this.drinkCount = drinkCount;
	}
	
	

}

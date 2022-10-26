package prob02;

public class Goods {
	private String drinkName;
	private int drinkPrice;
	private int drinkCount;

	public void showInfo() {
		System.out.println(drinkName + "(가격:" +
						   drinkPrice + "원)이 " +
					       drinkCount + "개 입고 되었습니다.)");
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

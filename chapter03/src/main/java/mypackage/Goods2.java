package mypackage;

public class Goods2 {
	public String name; 	// 모두 접근이 가능하다.
	protected int price;	// 같은 패키지, 자식에서 접근가능
	int countStock;			// 같은 패키지 defalut값(기본, 지정안함)
	private int countSold;	// 클래스 내부에서만 접근 가능
	
	public void m() {
		countSold = 100;
	}
}

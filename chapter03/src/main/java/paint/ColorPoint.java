package paint;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		// this.x = x;  main단에 privated 의해 this 코드 값을 못 읽음
		// setX(x); setX는 public이여서 사용이 가능
		// setY(y);
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override // 컴파일러에게 오버라이드인지 확인하기
	public void show() {
		super.show();
		System.out.println("점(X=" + getX() +
				", y=" + getY() +
				", color=" + color +
				")를 그렸습니다.");
	}
}

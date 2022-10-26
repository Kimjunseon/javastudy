package paint;

public class ColorPoint extends Point {
	private String color;

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

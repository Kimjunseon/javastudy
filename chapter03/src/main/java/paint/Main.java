package paint;

public class Main {

	public static void main(String[] args) {
		Point pt = new Point(10, 50);
//		pt.setX(10);
//		pt.setY(50);
		
		drawPoint(pt);
		
		// pt.disappear();
		pt.show(false);
		
		Point pt2 = new ColorPoint();
		pt2.setX(100);
		pt2.setY(200);
		((ColorPoint)pt2).setColor("red"); // pt에 있는 값을 접근제어를 하지 못해 캐스팅을 함
		
		drawPoint(pt2);
		pt2.show(false);		
		
	}

	public static void drawPoint(Point pt) {
		pt.show();
	}
//	public static void drawColorPoint(ColorPoint pt) {
//		pt.show();
//	}
//	
//	public static void drawPoint(ColorPoint pt) {
//		pt.show();
//	}
}

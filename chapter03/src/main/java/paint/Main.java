package paint;

public class Main {

	public static void main(String[] args) {
		Point pt1 = new Point(10, 50);
//		pt.setX(10);
//		pt.setY(50);
		
		drawPoint(pt1);
		
		// pt.disappear();
		pt1.show(false);
		
		Point pt2 = new ColorPoint(100, 200, "red");
//		pt2.setX(100);
//		pt2.setY(200);
//		((ColorPoint)pt2).setColor("red"); pt에 있는 값을 접근제어를 하지 못해 캐스팅을 함
		
		drawPoint(pt2);
		pt2.show(false);
		Triangle triangle  = new Triangle();
		// drawTriangle(triangle);
		drawShape(triangle);
		
		Rectangle rectangle  = new Rectangle();
		drawShape(rectangle);
		
		Circle Circle  = new Circle();
		drawShape(Circle);
		
	}	
	
	public static void draw(IDrawable drawble) {
		
	}
	
	public static void drawShape(Shape shape) {
		shape.draw();
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

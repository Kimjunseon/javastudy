package com.bitacademy.paint.main;

import com.bitacademy.paint.i.Drawable;
import com.bitacademy.paint.point.ColorPoint;
import com.bitacademy.paint.point.Point;
import com.bitacademy.paint.shape.Circle;
import com.bitacademy.paint.shape.Rectangle;
import com.bitacademy.paint.shape.Shape;
import com.bitacademy.paint.shape.Triangle;
import com.bitacademy.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
		Point pt1 = new Point(10, 50);
//		pt.setX(10);
//		pt.setY(50);
		// drawPoint(pt1);
		draw(pt1);
		// pt.disappear();
		pt1.show(false);
		
		
		
		Point pt2 = new ColorPoint(100, 200, "red");
//		pt2.setX(100);
//		pt2.setY(200);
//		((ColorPoint)pt2).setColor("red"); pt에 있는 값을 접근제어를 하지 못해 캐스팅을 함
		
		// drawColorPoint(pt2);
//		drawPoint(pt2);
		draw(pt2);
		pt2.show(false);
		
		Triangle triangle  = new Triangle();
		// drawTriangle(triangle);
		//drawShape(triangle);
		draw(pt2);
		
		Rectangle rectangle  = new Rectangle();
		// drawShape(rectangle);
		draw(rectangle);
		
		Circle circle  = new Circle();
		// drawShape(Circle);
		draw(circle);
		
		GraphicText gt = new GraphicText("Hello World");
		draw(gt);
		
		// instanceof test (상속이 되어 있는지 안돼있는지 확인)
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		// 오류: class는 hierachy 상위와 하위만 instanceof 연산자를 사용할 수 있다.
		// System.out.println(circle instanceof Triangle); 오류코드
		
		// 하지만, interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다.
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
	}	
	

	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
//	
//	public static void drawPoint(Point pt) {
//		pt.show();
//	}
//	public static void drawColorPoint(ColorPoint pt) {
//		pt.show();
//	}
//	
//	public static void drawPoint(ColorPoint pt) {
//		pt.show();
//	}
	
}

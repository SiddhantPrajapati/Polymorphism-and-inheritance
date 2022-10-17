import java.util.*;
public class Circle extends GeometricObject {
	private double radius;
	Circle(){
	}
	
	Circle(double x) {
		//super("White", false);
		radius = x;
	}
	
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	
	/*public double objectName() {
		System.out.println("Circle");
	}*/
}
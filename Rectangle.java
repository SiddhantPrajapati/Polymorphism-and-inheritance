import java.util.*;
import java.lang.*;
public class Rectangle extends GeometricObject {
	private double length;
	private double height;
	Rectangle(){
		//super("White", false);
	}
	
	Rectangle(double x, double y) {
		//super("White", false);
		length = x;
		height = y;
	}
	
	public double getArea() {
		return length * height;
	}
	
	public double getPerimeter() {
		return 2 * (length + height);
	}
	
	/*public double objectName() {
		System.out.println("Rectangle");
	}*/
}
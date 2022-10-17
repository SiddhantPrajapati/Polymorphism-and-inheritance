import java.util.*;
public class UserGeometricObject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Circle v1;
		//Rectangle v2;
		Circle v1 = new Circle(5.0);
		Rectangle v2 = new Rectangle(2.0,3.0);
		Square v3 = new Square(4.0);
		System.out.println("Enter the geometric object\n 1.Circle\n 2.Rectangle\n 3.Square");
		int n = sc.nextInt();
		System.out.println("Enter the colour\n 1.None\n 2.Red\n 3.Yellow\n 4.Green\n 5.Blue\n 6.Black\n 7.White");
		int cl = sc.nextInt();
		switch(n) {
			case 1: 
				//double a1 = v1.getArea();
				//double p1 = v1.getPerimeter();
				System.out.println("Circle area:" + v1.getArea() );
				System.out.println("Circle perimeter:" + v1.getPerimeter() );
				//String color = v1.setColour(cl);
				System.out.println("Circle colour:" + v1.setColour(cl));
				break;
			case 2:
				//double a2 = v2.getArea();
				//double p2 = v2.getPerimeter();
				System.out.println("Rectangle area:" + v2.getArea() );
				System.out.println("Rectangle perimeter:" + v2.getPerimeter() );
				//color = v2.setColour(cl);
				System.out.println("Rectangle colour:" + v2.setColour(cl) );
				break;
			case 3:
				//double a2 = v2.getArea();
				//double p2 = v2.getPerimeter();
				System.out.println("Square area:" + v3.getArea() );
				System.out.println("Square perimeter:" + v3.getPerimeter() );
				//color = v2.setColour(cl);
				System.out.println("Square colour:" + v3.setColour(cl) );
				break;
			default :
				System.out.println("Enter valid choice");
				break;
		}
	}
}
		
		
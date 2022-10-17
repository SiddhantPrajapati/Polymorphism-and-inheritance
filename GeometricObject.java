import java.util.*;
//import java.time.*;
public class GeometricObject {
    String colour;
	boolean filled;
	
	GeometricObject(){
	}
	
	GeometricObject(String colour, boolean filled){
		this.colour = colour;
		this.filled = filled;
	}
	
	public String setColour(int ch) {
		switch(ch) {
			case 1: 
				colour = "None";
				break;
			case 2: 
				colour = "Red";
				break;
			case 3: 
				colour = "Yellow";
				//return colour;
				break;
			case 4: 
				colour = "Green";
				//return colour;
				break;	
			case 5: 
				colour = "Blue";
				//return colour;
				break;
			case 6: 
				colour = "Black";
				//return colour;
				break;
			case 7: 
				colour = "White";
				//return colour;
				break;
			default :
				System.out.println("Enter valid choice.");
				break;	
		}
		return colour;
	}
	
	public String getColor() {
		return colour;
	}
	
	/*public void getDateCreated() {
		System.out.println(java.time.LocalDate.now());
	}*/
	
}
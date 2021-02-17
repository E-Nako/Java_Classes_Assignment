import java.util.Scanner;

public class Area {
	double length;
	double breadth;
	
	Area(double l, double b){
		length = l;
		breadth = b;
	}
	
	
	double returnArea() {
		return length * breadth;
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle: ");
		double l = input.nextDouble();
		
		System.out.println("Enter the breadth of the rectangle: ");
		double b = input.nextDouble();
		
		Area R1 = new Area(l, b);
		
		System.out.println("The area of the rectangle is: " + R1.returnArea());
	}

}

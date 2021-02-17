
public class Rectangle {
	int length;
	int breadth;
	
	Rectangle(int l, int b){
		length = l;
		breadth = b;
	}
	
	int Area() {
		return length * breadth ;
	}
	public static void main(String[] args) {
		Rectangle R1 = new Rectangle(4,5);
		Rectangle R2 = new Rectangle(5,8);
		
		System.out.println("Area of R1 = " + R1.Area());
		System.out.println("Area of R2 = " + R2.Area());
	}

}


public class Triangle {
	int base = 3;
	int height = 4;
	int hypotenus = 5;
	
	static double K = 0.5;
	
		Triangle(){
			System.out.println("Area = " + (K * 3 * 4 ) + " Sq units");
			System.out.println("Perimeter = " + (3 + 4 + 5) + " units");
		}
		
	public static void main(String[] args) {
		
		Triangle T1 = new Triangle();
		
	}

}

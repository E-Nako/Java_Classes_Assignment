import java.util.Scanner;

public class Complex {
	double a_imag;
	double a_real;
	double b_imag;
	double b_real;
	
	Complex(double a, double b, double c, double d){
		 a_imag = b;
			a_real = a;
			b_imag = d;
		    b_real = c;
	}
	
	void complexSum() {
		System.out.println("Sum = "+ (a_real + b_real)+ " + " + (a_imag + b_imag)+"i");
	}
	
	void complexDifference() {
		System.out.println("Difference = "+ (a_real - b_real)+ " + " + (a_imag - b_imag)+"i");
	}
	
	void complexProduct() {
		System.out.println("Product = "+ ((a_real * b_real)-(a_imag*b_imag))+ " + " + ((a_real * b_imag) + (a_imag * b_real))+"i");
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the real part of point A:");
		double a = input.nextDouble();
		System.out.println("Enter the imaginary part of point A without 'i':");
		double b = input.nextDouble();
		System.out.println("Enter the real part of point B:");
		double c = input.nextDouble();
		System.out.println("Enter the imaginary part of point B without 'i':");
		double d = input.nextDouble();
		
		Complex Number = new Complex(a,b,c,d);
		
		Number.complexSum();
		Number.complexDifference();
		Number.complexProduct();
		
		

	}

}

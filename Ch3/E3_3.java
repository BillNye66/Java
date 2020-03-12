import java.util.*;

class E3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a here: ");
		double a = input.nextDouble();
		System.out.print("Enter b here: ");
		double b = input.nextDouble();
		System.out.print("Enter c here: ");
		double c = input.nextDouble();
		System.out.print("Enter d here: ");
		double d = input.nextDouble();
		System.out.print("Enter e here: ");
		double e = input.nextDouble();
		System.out.print("Enter f here: ");
		double f = input.nextDouble();
		
		if ((a * d - b * c) == 0) {
			System.out.print("The given inputs present no solution. Dividing by zero is not possible.");
		}
		else {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.print("X = " + x + "\n"); 
			System.out.print("Y = " + y); 
		}
	}
}
import java.util.Scanner;

class E2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		fahrenheit = (9/5) * celsius + 32;
		System.out.print(fahrenheit);
	}
}
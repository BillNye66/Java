// Raymond Fisher
// 02/24/2020
// This program asks the user for an input of a temperature in celsius and gives the temperature in fahrenheit back.

import java.util.Scanner;

class E2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit = (9.0/5) * celsius + 32;
		System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	}
}
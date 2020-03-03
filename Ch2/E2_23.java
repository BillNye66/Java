// Raymond Fisher
// Date: 02/26/2020
// This program reads car efficiency info given by the user and determines the driving cost of a trip

import java.util.*;

class E2_23 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        double drivingDistance = input1.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input1.nextDouble();
        System.out.print("Enter the price per gallon: ");
        double pricePerGallon = input1.nextDouble();
        double gallons = drivingDistance / milesPerGallon;
        double costOfDriving = gallons * pricePerGallon;
        System.out.print("Cost of the trip: " + costOfDriving);
    }
}
import java.util.Scanner;

public class RestaurantApp {
public static void main (String [] args){

	System.out.println("Hello");

	double totalAmount = 0.0;
	double totalStaff=0.0;
	double totalTip=0.0;
	double tipPerStaff =0.0;
	final double tip = 0.10;


	//Object Declare, then assign

	Scanner keyboard;
	keyboard = new Scanner(System.in);

	System.out.println("How much was the total cost of the customer's bill");
	totalAmount = keyboard.nextInt();

	System.out.println("How many staff members are there today");
	totalStaff = keyboard.nextInt();




	//Process

	// 10% of totalAmount = totalAmount * 0.1

	 totalTip = (totalAmount * tip);

	 // tipPerStaff

	 tipPerStaff = (totalTip / totalStaff);


	System.out.println("The total tip per staff today = " + tipPerStaff + " euro");

}

}
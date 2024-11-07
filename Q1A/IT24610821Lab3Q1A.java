import java.util.Scanner;
class IT24610821Lab3Q1A{
     public static void main(String[] args){
	//Create a Scanner objects to read input
	Scanner input = new Scanner(System.in);

	//Prompt the user to enter the price per kilogram of rice 
	System.out.print("Enter the price of 1kg of rice: ");
	double pricePerkg = input.nextDouble();

	//Promt the user to enter the number of kilograms they want to buy
	System.out.print("Enter the number of kilograms you want to buy: ");
	double quantity = input.nextDouble();

	//Calculate the total amount to be paid
	double totalAmount = pricePerkg * quantity;

	//Display the total amount
	System.out.println("The total amount is: " + totalAmount);

	}
}
       
     
       
 
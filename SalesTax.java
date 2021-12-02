import java.util.Scanner;

public class SalesTax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();

		double tax = purchaseAmount * 0.07;
		System.out.println("Before casting, tax is " + tax);
		System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);
		
		System.out.println(Math.pow(2.5, 2));

	}
}
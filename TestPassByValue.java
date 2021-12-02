public class TestPassByValue {
	/** Main method */
	public static void main(String[] args) {
		// Declare and initialize variables
		int num1 = 1;
		int num2 = 2;

		System.out.printf("Before invoking the swap method, num1 is %d and num2 is %d\n", num1, num2);

		// Invoke the swap method to attempt to swap two variables
		swap(num1, num2);

		System.out.printf("After invoking the swap method, num1 is %d and num2 is %d\n", num1, num2);
	}

	/** Swap two variables */
	public static void swap(int n1, int n2) {
		System.out.printf("\tInside the swap method\n");
		System.out.printf("\t\tBefore swapping, n1 is %d and n2 is %d\n", n1, n2);

		// Swap n1 with n2
		int temp = n1;
		n1 = n2;
		n2 = temp;

		System.out.printf("\t\tAfter swapping, n1 is %d and n2 is %d\n", n1, n2);
	}
}
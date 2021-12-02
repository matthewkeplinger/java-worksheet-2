public class TestMax {
	public static void main(String[] args) {
		int i = 5;
		int j = 2;
		int k = max(i, j); // Step 1: passes the values of i, j to public static int max(), performs the comparison and if/else in max, returns to main
                                   // Step 3: int k receives result of max(i,j) and stores as a variable
		System.out.println("The maximum between " + i +
				" and " + j + " is " + k);
	}

	//** Return the max between two numbers
	public static int max(int num1, int num2) { // Step 2: takes values of i and j in main, performs operations in max method, returns result to method call in main
		int result;

		if (num1 > num2)
			result = num1;
		else
			result = num2;

		return result;
	}
}

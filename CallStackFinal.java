public class CallStackFinal {	
	public static int adjust(int num) {
		num = num / 2;
		return num;
	}

	public static int tweak(int value) {
		value = value + 15;
		return value;
	}

	public static int realign(int input) {
		input = adjust(input) * 4;
		input = tweak(input) - 2;
		return input;
	}

	public static void main(String[] args) {
		int num1 = 7, num2 = 0;
		num2 = realign(num1);
		System.out.println("num1 = " + num1 + "\nnum2 = " + num2);
	}
	
	public static double match(String s, int t, double f) { return t; }
	
	
	
}


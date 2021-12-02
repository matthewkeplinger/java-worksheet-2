public class CallStack2 {	
	public static int adjust(int num) {
		num = num / 2;
		return num;
	}

	public static int tweak(int value) {
		value = value + 10;
		return value;
	}

	public static int realign(int input) {
		input = adjust(input) * 3;
		input = tweak(input) * 2;
		return input;
	}

	public static void main(String[] args) {
		int num1 = 4, num2 = 0;
		num2 = realign(num1);
		System.out.println("num1 = " + num1 + "\nnum2 = " + num2);
	}
}


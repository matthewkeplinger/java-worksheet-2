public class CallStack {	
	public static int a(int i) {
		i = b(i) + 3;
		return i;
	}
	
	public static int b(int i) {
		i = c(i);
		return i;
	}
	
	public static int c(int i) {
		i *= 4;
		return i;
	}

	public static void main(String[] args) {
		int i = 2, j = 0;
		
		System.out.println("in main, j = " + j);
		j = a(i);
		System.out.println("in main, j = " + j);
	}
}


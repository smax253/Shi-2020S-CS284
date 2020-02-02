package recit2;

public class Calculator {
	public static int add(int x, int y) {
		return x+y;
	}
	public static int divide(int x, int y) {
		if(y==0) throw new IllegalArgumentException();
		return x/y;
	}
	public static int multiply(int x, int y) {
		return x*y;
	}
	public static int subtract(int x, int y) {
		return x-y;
	}
	public static int[] addValues(int[] values, int increment) {
		for (int i = 0; i<values.length; i++) {
			values[i] = values[i]+ increment;
		}
		return values;
	}
	public static int[] divideValues(int[] values, int divisor) {
		for(int i : values) {
			i = i / divisor;
		}
		return values;
	}
	public static boolean isNegative(int number) {
		if (number>0) return false;
		else return true;
	}
}

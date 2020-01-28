package recit1;
/**
 * 
 * @author smax2
 *
 */
public class LoopPractice {
	/**
	 * Returns whether the array given has a zero
	 * @param target An integer array
	 * @return A boolean, true if there is a zero, false otherwise
	 */
	public static boolean hasZero(int[] target) {
		for(int i = 0; i<target.length; i++) {
			if(target[i] == 0) return true;
		}
		return false;
	}
	
	public static int sum(int[] target) {
		int sum = 0;
		for(int i : target) {
			sum += i;
		}
		return sum;
	}
	
	public static int[] addIndex(int[] target) {
		for(int i = 0; i<target.length; i++) {
			target[i]+=i;
		}
		return target;
	}
	
	public static int[] drop(int dropTil, int[] target) {
		return null;
	}
	
	public static int[] addOne(int[] target) {
		return null;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[6];
		int[] arr2 = {5,3,7,2,9};
	}
}

package recit1;

public class ArraysAndLoopPractice {
	public static void main(String[] args) {
		int[] arr1 = {5,3,8,2,7};	//[5,3,8,2,7]
		int[] arr2 = new int[5];   	//[0,0,0,0,0]
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for(int i : arr1) {
			System.out.println(i);
		}
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] += 6;
		}
		for(int i : arr1) {
			System.out.println(i);
		}
	}
}

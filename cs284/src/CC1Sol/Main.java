package CC1Sol;

import java.util.Random;
import java.util.Arrays;

public class Main{
    public static int[] extremes(int[] nums){
        if (nums == null || nums.length == 0) return null;
        int[] result = {nums[0], nums[0]};
        for(int i = 1; i < nums.length; i++){
            int current = nums[i];
            if (result[0]>current) result[0] = current;
            else if (result[1]<current) result[1] = current;
        }
        return result;
    }
    public static int[] copyEvens(int[] nums, int count){
        int[] result = new int[count];
        for(int i = 0, added = 0; i<nums.length && added<count; i++){
            int current = nums[i];
            if (current % 2 == 0) {
                result[added] = current;
                added++;
            }
        } //definitely also doable with a while loop
        return result;
    }
    public static String getTo24(int a, int b){
        if(a+b==24) return "add";
        else if (a-b==24) return "subtract";
        else if (a*b==24) return "multiply";
        else if (b != 0 && a/b == 24) return "divide";
        else return "none";
    }
    public static void fizzbuzz(){
        for(int i = 1; i<=100; i++){
            String s = "";
            if(i%3 == 0) s += "Fizz";
            if(i%5 == 0) s += "Buzz";
            if(s.length() == 0) s += i;
            System.out.println(s);
        }
    }
    public static void main(String[] args){
        final int BOUNDS = 100;
        final int LENGTH = 30;
        Random r = new Random();
        int[] nums = new int[LENGTH];
        for(int i = 0; i<LENGTH; i++){
            nums[i] = r.nextInt(BOUNDS);
        }
        System.out.println(Arrays.toString(nums));
        System.out.printf("Extremes: %s\n", Arrays.toString(extremes(nums)));
        int numberEvens = r.nextInt(LENGTH/6)+2;
        System.out.printf("First %d evens: %s\n", numberEvens, Arrays.toString(copyEvens(nums, numberEvens)));
        int a = 20, b=4;
        System.out.printf("Operation for %d and %d to get to 24: %s\n", a,b, getTo24(a,b));
        fizzbuzz();
    }

}
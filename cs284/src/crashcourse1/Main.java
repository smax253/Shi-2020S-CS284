public class Main{
    
    public static int[] extremes(int[] values){
        int[] result = {values[0],values[0]};
        for(int i = 1; i<values.length; i++){
            if (values[i]>result[1]) result[1] = values[i];
            else if(values[i] < result[0]) result[0] = values[i];
        }
        return result;
    }

    public static int[] copyEvens(int[] values, int count){
        int[] result = new int[count];
        int index = 0;
        for(int i = 0; i<values.length && index<count; i++){
            if(values[i] % 2 == 0) {
                result[index] = values[i];
                index++;
            }       
        }
        return result;
    }

    public static String getTo24(int a, int b){
        if(a+b == 24) return "add";
        else if (a-b == 24) return "subtract";
        else if (a*b == 24) return "multiply";
        else if (a/b == 24) return "divide";
        else return "none";
    }

    public static void fizzBuzz(){
        for(int i = 1; i<=100; i++){
            String s = "";
            if (i%3==0) s += "Fizz";
            if (i%5==0) s += "Buzz";
            if (s.length() == 0) s += ""+i;
            System.out.println(s);
        }
    }
    
    public static void main(String[] args){
        fizzBuzz();
    }
}
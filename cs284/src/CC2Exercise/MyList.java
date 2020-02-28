package CC2Exercise;

public abstract class MyList<E extends Comparable<E>>{
    //get(), set(), length(), and toString()
    abstract E get(int index);
    abstract void set(int index, E element);
    abstract int length();
    public String toString(){
        String result = "[";
        if(length() > 0) {
            result += get(0).toString();
            for(int i = 1; i<length(); i++){
                result += ","+get(i).toString();
            }
        }
        result += "]";
        return result;
    }
    public Comparable<E>[] extremes(){
        //Fill in this code!
        //Implement extremes with the given abstract methods only and the compareTo() method!
        return null;
    }
}
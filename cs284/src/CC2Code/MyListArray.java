package CC2Code;

public class MyListArray<E> extends MyList<E>{
    private E[] data;
    public MyListArray(int length){
        data = (E[]) new Object[length];
    }
    public E get(int index){
        return data[index];
    }
    public void set(int index, E item){
        data[index] = item;
    }
    public int length(){
        return data.length;
    }
    
}
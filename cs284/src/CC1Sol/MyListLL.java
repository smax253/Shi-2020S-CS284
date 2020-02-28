package CC1Sol;

public class MyListLL<E> extends MyList<E>{
    private class Node<E>{
        public E item;
        public Node<E> next;
        public Node(E item){
            this.item = item;
        }
    }
    private Node<E> head;
    private int length;
    public MyListLL(int length){
        // ???
        head = new Node<>(null);
        Node<E> current = head;
        for(int i = 1; i<length; i++){
            current.next = new Node<>(null);
            current = current.next;
        }
    }
    public E get(int index){
        // ???
        int currindex = index;
        Node<E> current = head;
        while(currindex>0){
            current = current.next;
            currindex--;
        }
        return current.item;
    }
    public void set(int index, E item){
        int currindex = index;
        Node<E> current = head;
        while(currindex>0){
            current = current.next;
            currindex--;
        }
        current.item = item;
    }
    public int length(){
        Node<E> current = head;
        int count = 0;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {5,4,7,2};
        String[] strs = {"hello","friday","is","here"};
        MyList<String> arr = new MyListArray<>(4);
        MyList<String> strarr = new MyListLL<>(4);
        for(int i = 0; i<strs.length; i++){
            strarr.set(i, strs[i]);
            arr.set(i, strs[i]);
        }
        System.out.println(strarr.length());
        System.out.println(strarr.toString());
        System.out.println(arr.toString());
    }
}
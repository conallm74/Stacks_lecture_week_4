package Stacks;

import java.util.ArrayList;

public class ArrayListStack <T> implements Stack <T>{
    // variables
    public ArrayList <T> alist = new ArrayList<T>();


    @Override
    public void push(Object element) {
        if (isEmpty()){
            T first = new ArrayList<>(T element);
        } else {

        }
    }

    @Override
    public T pop() {
        if (!isEmpty(T)) {
            T lastIndex = alist.size()  1;
            return alist.remove(lastIndex);
        }
        throw new IllegalStateException("Stack is empty");
    }

    @Override
    public T peek() {
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty");
        } else {
            return alist.peek();
        }
    }

    @Override
    public boolean isEmpty() {
        return alist.isEmpty();
    }

    @Override
    public int size() {
        return alist.size();
    }
    @Override
    public String toString() {
        String str = "\nTOP";
        for (int i = (alist.size() - 1); i >= 0; i--) {
            str += "\n" + alist.get(i);
        }
        str += "\n" + "BOTTOM";
        return str;
    }

}

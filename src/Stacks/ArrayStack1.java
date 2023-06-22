package Stacks;
import java.util.Arrays;

public class ArrayStack1 <T> {
    // define variables that are local to this class

    private int maxSize; // define the size of the array
    private int top; // will point to current element on the top, and should be less thatn maxSize
    private T[] items; // array to store items, elements of type T


    // constructors

    public ArrayStack1(int size) {
        this.maxSize = size; // size of the array
        this.top = -1; // our null indicates array is currently empty. If we geet -1 we know array is currently empty
        this.items = (T[]) new Object[maxSize];
        // items expect to store elements losely of type T
        // that is decided at run time
        // to declare the array, we only know now that we will store
        // Objects. Hence the -> (T[]) without the Cast there, we will have a mismatch
        // on data type on line 16. We then cast to type T so that
        // the data type on line 16 are the same type.
        /*
        // the items expects to store elemensts of type T
        // that is decided at runtime.
        // to declare the array, we only know now that we will
        // store Objects, that creates a mismatch on data types
        // on line 21. We then cast the Object to type T so that
        // the data types on line 21 are teh same type
         */

    }


    // methods
    public void push(T element) {
        if (top == (maxSize - 1)) {
            throw new IndexOutOfBoundsException();
        } else {
            top++;// pre increment top
            items[top] = element;
        }
    }

    public boolean isEmpty() { // this will return a boolean (true or false) if the array if empty.
        return top == -1; // we need to return a value
    }

    public int size() {
        return top + 1; // top goes from minus 1 to zero
        // it's how many elements you have actually stored.
    }


    private void reallocate(){
        maxSize *= 2;
        items = Arrays.copyOf(items, maxSize);
    }

    public T pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException();
        } else {
            T ellement = items[top];// place holder for t element, read the top elem
            top--; // it's taking off the top element
            return ellement;
        }
    }
    public T peek() {
        if (top == -1) {
            throw new IndexOutOfBoundsException();
        } else {
            T ellement = items[top];// place holder for t element
            return ellement;
        }
    }



    @Override
    public String toString() {
        String str = "\nTop";
        int counter = top;
        while (counter >= 0) {

            str += "\n" + items[counter];
            counter--;
        }
        return str + "\nBOTTOM";
    }
}
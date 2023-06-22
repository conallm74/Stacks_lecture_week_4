package Stacks;

public class ArrayStack1App {
    public static void main(String[] args) {
        ArrayStack1<Integer> as1 = new ArrayStack1<>(10);
        System.out.println("#############");
        System.out.println("Created an array stack object to store integers");
        System.out.println("is AS empty: " + as1.isEmpty());

        System.out.println("##### push ########");
        System.out.println("push(2)");
        as1.push(2);
        //DEBUG System.out.println("as1[0]: " + Arrays.toString(as1.getItems()));
        System.out.println("as size: " + as1.size());
        System.out.println("is AS empty: " + as1.isEmpty());
        System.out.println("as1: " + as1.toString());

        System.out.println("##### push called twice for 3 then 4 ########");
        as1.push(3);
        as1.push(4);
        System.out.println("as size: " + as1.size());
        System.out.println("is AS empty: " + as1.isEmpty());
        System.out.println("as1: after 3 pushes" + as1.toString());


        System.out.println("##### pop the top ########");
        System.out.println("pop the top: " + as1.pop());
        System.out.println("as size: " + as1.size()); // should get size of 2
        System.out.println("is AS empty: " + as1.isEmpty());
        System.out.println("as1: after pop of top" + as1.toString()); // Bot = 2, top = 3


        System.out.println("##### peek the top ########");
        System.out.println("peek the top: " + as1.peek());
        System.out.println("as size: " + as1.size()); // should get size of 2
        System.out.println("is AS empty: " + as1.isEmpty());
        System.out.println("as1: peek of top" + as1.toString()); // Bot = 2, top = 3
    }
}

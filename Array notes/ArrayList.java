// Array List 
// in java, arrays are fixed in size to overcome this java provides the Arraylist class in the java.utill package

import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);

        System.out.println(list); // [10, 20]

        list.remove(1); // Remove element at index 1

        System.out.println(list); // [10]
    }
}
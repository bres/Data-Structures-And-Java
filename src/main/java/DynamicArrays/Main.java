package DynamicArrays;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Vector:will grow a 100% of  its size when it is full,  synchronized-->only a single thread can access it
        // ArrayList:will grow a 50% of  its size when it is full , no synchronized

        ArrayList<Integer> list = new ArrayList<>(); //Integer is a wrapper for int
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        list.remove(0);
        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(40));
        System.out.println(list.contains(30));
        System.out.println(list.size());
        list.toArray(); // converts arrayList to array
        System.out.println(list);

    }
}

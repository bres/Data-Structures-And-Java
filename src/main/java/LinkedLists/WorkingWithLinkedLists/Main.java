package LinkedLists.WorkingWithLinkedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        //add item at the end
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        //add item at the beginning
        list.addFirst(5);
        //remove last item
        list.removeLast();
        //remove first item
        list.removeFirst();
        //check if the list contains an item
        System.out.println(list.contains(10));
        //return the index of first occurrence of item
        System.out.println(list.indexOf(10));
        //return the size of the list
        System.out.println(list.size());
        //convert linkedList to a regular array
        var array = list.toArray();
        System.out.println("This is an array: "+ Arrays.toString(array));

        System.out.println("This is a linked list: "+list);
    }
}

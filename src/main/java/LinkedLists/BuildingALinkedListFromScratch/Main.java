package LinkedLists.BuildingALinkedListFromScratch;

/**
 * @author bres george
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        var list = new LinkedList();
        System.out.println("-------------------------");
        //Get the size of a LinkedList
        System.out.println("Initial size:" + list.sizeOflist());
        System.out.println("-------------------------");

        //Add a value at the beginning of a LinkedList

        //list.addFirst(10);

        //Add a value at the end of a LinkedList
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        //remove the first item from a list

        //list.removeFirst();

        //remove the last item from a list

        //list.removeLast();

        System.out.println("-------------------------");
        System.out.println("Final size:" + list.sizeOflist());
        System.out.println("-------------------------");

        //Check if a LinkedList contains a value

        //System.out.println(list.contains(10));

        //Find the index of a value inside a LinkedList

        //System.out.println(list.indexOf(20));

        //Reverse a linked  List

        //list.reverse();

        //Get kth value from the end
        System.out.println("the value form the end of the list is:" + list.getKthFromTheEnd(10));

        //convert Linked List to array

        //var array = list.toArray();
        //System.out.println(Arrays.toString(array));
    }
}

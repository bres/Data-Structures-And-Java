package LinkedLists.BuildingALinkedListFromScratch;

import java.util.NoSuchElementException;

public class LinkedList {
    /*
     * This node class is a part of the implementation of the LinkedList
     * we don't need to work with this class directly,
     * so this should not be declared as a public class but declared
     * internally.It is an implementation detail.
     * Now we have access to all of its private fields
     */
    private class Node {
        private int value;
        private Node next;

        //custom constructor
        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    //addLast
    public void addLast(int item) {
        //I can skip the Node type and use var, so
        //java compiler will detect automatically the type (Node)

        //Node node =new Node();
        //var node = new Node(); //this does not make sense,
        //whenever we create a node must-have a value,
        //so we will create a custom constructor on the internal class Node.

        //node.value=item; //value it is private, so I cant access it outside the class.
        var node = new Node(item);
        //we should check to see if the list is empty or not
        //that means we don't have any nodes in the linked list
        if (isEmpty())
            //the first and the last node are the same because we have only one node
            first = last = node;
        else {
            // adds the new node after the current last node.
            last.next = node;
            // the last (Head) pointer should be updated to point to the new last node.
            last = node;
        }
        size++;
    }

    //addFirst
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first; //point to the first node
            first = node;
        }
        size++;

    }

    //indexOf
    public int indexOf(int item) {
        //we need to traverse this list from the beginning all the way to the end as soon as
        //we find an item with the given value (item), we are going to return the index of that item
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    //contains
    public boolean contains(int item) {
        /* Once again, we should traverse the list starting from the
         * beginning all the way to the end. If we find the item,
         * we will return true otherwise false, however,
         * we have built this logic in the indexOf method, so we can reuse it.
         */
        return indexOf(item) != -1;
    }

    //removeFirst
    public void removeFirst() {
        //[10-> 20 ->30]
        //first ->20
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            // will remove the link to the second node
            first.next = null;
            first = second;
        }
        size--;
    }

    //removeLast
    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last)
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }

    //sizeOfAList
    public int sizeOflist() {
        return size;
    }

    //convert a linkedList in to array
    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    //reverse a linked List
    public void reverse() {

        if (isEmpty()) {
            return;
        }
        var previous = first;
        var current = first.next;

        //traverse the list until the current become null
        while (current != null) {
            //temporarily store the link of the next node;
            var next = current.next;
            //reverse the link
            current.next = previous;
            //move forward
            previous = current;
            current = next;
        }
        //change the last pointer to become first
        //and point to null
        last = first;
        last.next = null;
        //change the first point to last using the previous state
        first = previous;
    }

    //find the Kth node from the end of a linked list in one pass
    public int getKthFromTheEnd(int k) {
        // [ 10 -> 20 -> 30 -> 40 ->50 ]
        //   *     -     *
        //         *     -     *
        //               *     -    *
        //k=1 (50)
        //k=2 (40)
        //k=3 (30) distance between the two pointers =2

        //check if the list is empty and return an exception
        if (isEmpty())
            throw new IllegalArgumentException();

        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++){
            b = b.next;
            if (b ==null)
                throw new IllegalArgumentException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    //whatever node we will give, the function will return the previous node
    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;// In case we did not find the given node
    }

    //check if the linkedList is empty
    private boolean isEmpty() {
        return first == null;
    }
}
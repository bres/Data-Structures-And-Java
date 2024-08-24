package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //ArrayDeque is an implementation of Queue
        // [ 10, 20, 30 ]
        // front----back
        // as we're adding items they join the back of the queue and remove from the front
        Queue<Integer> queue = new ArrayDeque<>();
        //add from the back
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        //remove from the front
        //queue.remove();
        reverse(queue);
        System.out.println(queue);
    }

    //reversing a queue
    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty())
           stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());
     }
}

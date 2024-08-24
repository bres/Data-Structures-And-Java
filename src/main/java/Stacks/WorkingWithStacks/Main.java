package Stacks.WorkingWithStacks;

import java.util.Stack;


public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        //Standard operations on a stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        //remove the last item that is inserted
        var top =stack.pop();
        System.out.println(top);
        System.out.println(stack);

        //check if the stack is empty and return a boolean
        System.out.println(stack.empty());

        //telling us about the item on top of the stack without removing it
        top = stack.peek();
        System.out.println(top);

        //Uncommon operations on a stack ->returns the position
        System.out.println(stack.search(10));

        //reverse a string using stack
        StringReverser reverser = new StringReverser();
        var result = reverser.reverse("abcdef");
        System.out.println(result);
        }
}

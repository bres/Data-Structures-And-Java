package Stacks.WorkingWithStacks;

import java.util.*;

public class Expression {

    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

    /*
     * we iterate over the string get each character at a time, if it's an
     * opening bracket it doesn't matter which type we could have a square
     * bracket or angle bracket, if it's an opening or left bracket we need
     * to push it onto the top of our stack, if we get a regular character like
     * one or space or Plus or whatever we ignore it, when we get to a closing
     * bracket we need to pop the character on top of the stack and compare it
     * with the current character.If they match awesome we go forward and keep
     * repeating this until we get to the end of the string, but if they
     * don't match for example, if we had angle brackets here we
     * immediately stop and return false from our method.
     */
    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (!bracketMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean bracketMatch(char left, char right) {
        if (leftBrackets.indexOf(left) == rightBrackets.indexOf(right))
            return true;
        return false;
    }
}


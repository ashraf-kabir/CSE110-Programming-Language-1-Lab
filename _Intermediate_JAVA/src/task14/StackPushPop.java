package task14;

import java.util.Stack;

import static java.lang.System.out;

public class StackPushPop {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);

    }

    private static void printStack(Stack<String> s) {
        if (s.isEmpty()) {
            out.println("You've nothing in your stack");
        } else {
            out.printf("%s TOP\n", s);
        }
    }
}

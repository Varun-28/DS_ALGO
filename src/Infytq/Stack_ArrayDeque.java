package Infytq;

import java.util.ArrayDeque;
import java.util.Deque;

class Stack_ArrayDeque {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();	// no restrictions in capacity
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Numbers in stack - After addition of 5 values");
        for (Integer val : stack) {
            System.out.println(val);
        }

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("\nNumbers in stack - After removal of 3 values");
        for (Integer val : stack) {
            System.out.println(val);
        }

        System.out.println();
        System.out.println("Top of the stack using peek() -> "+stack.peek());

        stack.pop();
        stack.pop();

        //Uncomment the below code and observe the output
        //System.out.println("Trying to remove the element from the top of the stack using pop() when stack is empty - "+stack.pop());	// throws NoSuchElementException since stack is empty

    }
}

// check out this link -> https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html

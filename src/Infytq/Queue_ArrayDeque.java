package Infytq;

import java.util.ArrayDeque;
import java.util.Deque;

class Queue_ArrayDeque{

    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<String>();	// no restrictions in capacity
        queue.add("Joe");
        queue.add("Jack");
        queue.add("Eva");
        queue.add("Mia");
        queue.add("Luke");

        System.out.println("People in queue - After addition of 5 people");
        for (String str : queue) {
            System.out.println(str);
        }

        queue.remove();
        queue.remove();
        queue.remove();

        System.out.println("\nPeople in queue - After removal of 3 people");
        for (String str : queue) {
            System.out.println(str);
        }

        System.out.println();
        System.out.println("Head of the queue using element() - "+queue.element());
        System.out.println("Head of the queue using peek() - "+queue.peek());
        queue.remove();
        queue.remove();

        // new person added to the empty queue using offer()
        queue.offer("Emma");

        // newly added person removed using poll()
        queue.poll();

        System.out.println();
        System.out.println("Removing the head of the queue using poll when queue is empty - "+queue.poll());	// returns null since queue is empty

        System.out.println("Head of the queue using peek() when queue is empty - "+queue.peek());	// returns null since queue is empty

        /* Uncomment the lines of code given below one at a time and observe the output */
        //System.out.println("Head of the queue using element() when queue is empty - "+queue.element());	// throws NoSuchElementException since queue is empty

        //System.out.println("Removing the head of the queue using remove() when queue is empty");
        //queue.remove();		// throws NoSuchElementException since queue is empty

    }
}

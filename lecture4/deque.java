import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);      deque.addLast(2);
        deque.removeLast();       deque.removeLast();
        deque.offerFirst(1);    deque.offerLast(2);
        deque.pollFirst();        deque.pollLast();
        deque.getFirst();         deque.getLast();
        deque.peekFirst();        deque.peekLast();
    }
}

// You can add data in the beginning and in the end. Data extraction also can be done either way - and from the
// beginning, and from the end. Linear collection.

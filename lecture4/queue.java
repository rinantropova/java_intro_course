import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(4);

        int item = queue.remove();
    }
}


// FIFO principle, elements are added one after another, while when removing elements, .remove method does it from the
// first added element in the queue.
// java.util.NoSuchElementException
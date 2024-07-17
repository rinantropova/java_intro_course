import java.util.*;

public class priorQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}

// PriorityQueue - the highest priority is assigned to the "smallest" element. What the "Smallest" means for
// different data types should be described in the code.

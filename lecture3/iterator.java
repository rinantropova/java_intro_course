package lecture3;
import java.util.*;

public class iterator {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            // System.out.println(col.next());
            col.next();
            col.remove();
        }

    }
}

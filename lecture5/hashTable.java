// retired collection, do not allow storing 'null' values
import java.util.*;

public class hashTable {
    public static void main(String[] args) {
        Map<Integer, String> table = new Hashtable<>();
        table.put(1, "two");
        table.put(11, "one one");
        table.put(2, "one");
        System.out.println(table);
    }
}

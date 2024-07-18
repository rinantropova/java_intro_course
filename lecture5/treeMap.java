import java.util.*;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "one"); System.out.println(tMap);
        tMap.put(6, "six"); System.out.println(tMap);
        tMap.put(4, "four"); System.out.println(tMap);
        tMap.put(3, "three"); System.out.println(tMap);
        tMap.put(2, "two"); System.out.println(tMap);

        tMap.put(2, "two"); System.out.println(tMap.descendingKeySet());
        tMap.put(2, "two"); System.out.println(tMap.descendingMap());
    }
}
// order by the keys

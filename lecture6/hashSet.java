import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1); set.add(12); set.add(123);
        set.add(1234); set.add(1234);
        System.out.println(set.contains(12)); // true
        set.add(null);
        System.out.println(set.size()); // 5
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(12);

        for (var item : set) System.out.println(item); // null 1 1234 123

        set.clear();
        System.out.println(set); // []
    }
}

// sets are built on maps, there is only a key and value is some constant, that is not important for us. We work
// only with the keys.

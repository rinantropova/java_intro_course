import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        // Integer a = 123;
        // System.out.println(a.hashCode());
        // System.out.println("z".hashCode());
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "one");
        db.put(2, "two"); 
        db.put(null, "!null");
        System.out.println(db);
        System.out.println(db.get(44));
        // db.remove(null);
        System.out.println(db);
        System.out.println(db.containsValue("one"));
        // System.out.println(db.containsValue(1));
        // System.out.println(db.containsKey("one"));
        System.out.println(db.containsKey(1));
        System.out.println(db.keySet());
        System.out.println(db.values());

    }
}

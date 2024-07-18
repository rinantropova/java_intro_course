import java.util.*;

public class LinkedHmap {
    public static void main(String[] args) {
        Map<Integer, String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "one one");
        linkmap.put(1, "one");
        linkmap.put(2, "two");
        System.out.println(linkmap);
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "one one");
        map.put(2, "two");
        map.put(11, "one");
        System.out.println(map);
    }
}

// if you need speed, use HashMap,
// if order of the elements is more important, use LinkedHashMap

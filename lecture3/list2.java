package lecture3;
import java.util.List;
public class list2 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = List.of('R', 'i', 'n', 'a');
        System.out.println(list1);
        // list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);

    }
}

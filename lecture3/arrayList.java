package lecture3;
import java.util.ArrayList;
import java.util.List;
public class arrayList {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>(); // Save type - better always to use this one
        ArrayList list = new ArrayList(); // row type

        list.add(2809);
        list.add("string line");

        for (Object o : list) {
            System.out.println(o);
        }
    }
}

// ArrayList<Integer> list1 = new ArrayList<Integer>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10); - 10 elements space
// ArrayList<Integer> list4 = new ArrayList<>(list3);

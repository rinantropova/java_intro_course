package oop;
import java.util.*;

public class program {
    public static void main(String[] args) {

        // client code
        worker1 w1 = new worker1();
        w1.firstName = "Name_1";
        w1.lastName = "Surname_1";
        w1.salary = 100;
        w1.id = 1000;

        worker1 w4 = new worker1();
        w4.firstName = "Name_1";
        w4.lastName = "Surname_1";
        w4.salary = 100;
        w4.id = 1000;

        worker1 w2 = new worker1();
        w2.firstName = "Name_2";
        w2.lastName = "Surname_2";
        w2.salary = 200;
        w2.id = 2000;

        worker1 w3 = new worker1();
        w3.firstName = "Name_3";
        w3.lastName = "Surname_3";
        w3.salary = 300;
        w3.id = 3000;

        System.out.println(w1.toString());
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<worker1>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));
    }
}

package lecture1;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        System.out.println("Hello world"); // print function

        String s = null;
        System.out.println(s);

        short age = 10;
        int salary = 123456;
        System.out.println(age); // 10
        System.out.println(salary); // 123456

        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415

        float f = 123.45f;
        double d = 123.45;
        System.out.println(f);
        System.out.println(d);

        // char ch = '{';
        // System.out.println(ch);

       char ch = '1';
       System.out.println(Character.isDigit(ch)); // True
       ch = 'a';
       System.out.println(Character.isDigit(ch)); // False

       boolean flag1 = 123 <= 234;
       System.out.println(flag1); // true
       boolean flag2 = 123 >= 234 || flag1; // operation 'and', && can be used instead as well
       System.out.println(flag2); // true
       boolean flag3 = flag1 ^ flag2; // disjunction (operation 'or')
       System.out.println(flag3); // false

       String msg = "Hello world";
       System.out.println(msg);

       int a = 5;
       int b = 2;
       System.out.println(a | b);
       // 101
       // 010
       // 111 (or)
       System.out.println(a & b);
       //101
       //010
       //000
       System.out.println(a ^ b);
       //101
       //010
       // 111

       boolean w = true;
       boolean n = true;
       System.out.println(w & n);
       System.out.println(w && n);


       String str = "qwwe1"; // 4, 0 ... 3
    //    boolean m = str.length() >= 5 && str.charAt(4) == '1';
       boolean m = str.length() >= 5 & str.charAt(4) == '1';

       System.out.println(m);

    }
    
}
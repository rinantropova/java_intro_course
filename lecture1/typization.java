package lecture1;

public class typization {
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456
        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); // 1022
        // d = 'mistake';
        // error: incompatible types:
        // String cannot be converted to double
        // int z = 123;
        System.out.println(Integer.MIN_VALUE);

        String s = "qwer";
        s.length();
        s.charAt(1);

        int b = 123;
        // b = b -- - -- b;
        b = --b - b --;
        System.out.println(b);
        // b++;
        System.out.println(b++); // postfix increment, priority is less than output
        System.out.println(b);
        System.out.println(++b); // prefix increment, priority is higher than output

        int l = 18;
        // 10010
        // l = l << 1;
        System.out.println(l >> 1); // probit operations
        // 1001


        
    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }

}
    


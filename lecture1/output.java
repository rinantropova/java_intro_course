package lecture1;

public class output {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);

        String res2 = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res2);


        String s = "qwe";
        int w = 123;
        String q = s + w;
        System.out.println(q);


        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3.141500
        System.out.printf("%.2f\n", pi); // 3.14
        System.out.printf("%.3f\n", pi); // 3.141
        System.out.printf("%e\n", pi); // 3.141500e+00
        System.out.printf("%.2e\n", pi); // 3.14e+00
        System.out.printf("%.3e\n", pi); // 3.141e+00


        {
            int l = 222;
            System.out.println(l); // area of variable visibility
        }
        int l = 123;
        System.out.println(l);
    }
}

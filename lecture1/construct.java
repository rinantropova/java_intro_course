package lecture1;

public class construct {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);


        int s = 1;
        int f = 2;
        int k = 0;
        if (s > f) k = a;
        if (f > s) k = f;
        System.out.println(k);


        int h = 1;
        int g = 2;
        int min = h < g ? h : g;
        System.out.println(min);
    }
}

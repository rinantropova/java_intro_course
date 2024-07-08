package lecture1;
// import java.util.Scanner;

public class switch_op {
    public static void main(String[] args) {
        int a = 123;

        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4: System.out.println("a");
                break;
            case 10: System.out.println('b');
                break;
            default:
                break;
        }
    }
}

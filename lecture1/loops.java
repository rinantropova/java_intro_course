package lecture1;

public class loops {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;

        }
        System.out.println(count);



        int val = 321;
        int counter = 0;
        do {
            val /= 10;
            counter++;
        } while (val != 0);
        System.out.println(counter);



        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0)     
                continue;
            System.out.println(i);
        }


        // for (int i = 0; i < 10; i++) {
        //     for (int q = 0; q < 5; q++) {
        //         break;
        //     }
        //     break;
        // }

        // collections
        int arr[] = new int[] {1, 2, 3, 4, 5, 66};
        for (int item : arr) {
            System.out.printf("%d", item);
        }
        System.out.println();
    }
}

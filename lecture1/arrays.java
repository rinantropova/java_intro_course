package lecture1;

public class arrays {
    public static void main(String[] args) {
        // 1D arrays
        int[] arr = new int[10];
        arr[3] = 13;
        System.out.println(arr.length);

        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length);


        // multi-dimensional arrays:
        int[] array[] = new int[3][5];
        for (int[] line: array) {
            for (int item: line) {
                System.out.printf("%d", item);
            }
            System.out.println();
        }

        int[][] arr1 = new int[3][5];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%d", arr1[i][j]);
            }
            System.out.println();
        }
    }
    
}

public class program {
    public static void main(String[] args) {
        // String str = "";
        // for (int i = 0; i < 1_000_000; i++) {
        //     str += "+";
        // } ~40 sec

        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        } // ~9 ms
        System.out.println(System.currentTimeMillis() - s);

    }
}

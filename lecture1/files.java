package lecture1;

// import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class files {
    public static void main(String[] args) throws IOException {
        // try (FileWriter fw = new FileWriter("file.txt", false)) {
        //     fw.write("line 1");
        //     fw.append('\n');
        //     fw.append('2');
        //     fw.append('\n');
        //     fw.write("line 3");
        //     fw.flush();
        // }
        // catch (IOException ex) {
        //     System.out.println(ex.getMessage());
        // }


        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != - 1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
        fr.close();


        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}

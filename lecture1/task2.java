// Даны два файла, в каждом из которых находится запись
// многочлена. Сформировать файл содержащий сумму
// многочленов.

package lecture1;
import java.io.*;

public class task2 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("first.txt", false)) {
            fw.write("10");
            // fw.append('\n');
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter("second.txt", false)) {
            fw.write("10");
            // fw.append('\n');
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter("summary.txt", false); 
            BufferedReader br1 = new BufferedReader(new FileReader("first.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("second.txt"))) {
                String str = br1.readLine();
                fw.write(str);
                fw.write(" + ");

                String str2 = br2.readLine();
                fw.write(str2);
                fw.write(" = ");

                fw.write(String.valueOf(sum(str, str2)));
                fw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    private static int sum(String str, String str2) {
        try {
            int first = Integer.parseInt(str);
            int second = Integer.parseInt(str2);
        
            return first + second;
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
            return 0;
        }
  
    }
}

// Задана натуральная степень k. Сформировать случайным
// образом список коэффициентов (значения от 0 до 100)
// многочлена многочлен степени k.
// *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0

package lecture1;
import java.util.Random;

public class task1 {
    public static String generatePolynomial(int k) {
        Random rand = new Random();
        StringBuilder polynomial = new StringBuilder();
        boolean isFirstTerm = true;

        for (int i = k; i >= 0; i--) {
            int coefficient = rand.nextInt(101);
            if (coefficient != 0) {
                if(!isFirstTerm && coefficient > 0) {
                    polynomial.append(" + ");
                } else if (!isFirstTerm) {
                    polynomial.append(" - ");
                }

                if (i > 0 && coefficient != 1) {
                    polynomial.append(Math.abs(coefficient)).append("*");
                }

                if (i > 1) {
                    polynomial.append("x^").append(i);

                } else if (i == 1) {
                    polynomial.append("x");
                } else {
                    polynomial.append(Math.abs(coefficient));
                }
                isFirstTerm = false;
            }
        }
        polynomial.append(" = 0");
        return polynomial.toString();

    }
    public static void main(String[] args) {
        int k = 2;
        System.out.println(generatePolynomial(k));
    }
}

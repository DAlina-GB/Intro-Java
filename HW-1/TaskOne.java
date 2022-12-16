
/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 */

/**
 * TaskOne
 */
import java.util.Scanner;

public class TaskOne {
    public static int triangularNum(int n) {
        return (n * n + n) / 2;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input number n: ");
        int num = iScanner.nextInt();
        int result = triangularNum(num);
        System.out.println(result);
        iScanner.close();
    }

}
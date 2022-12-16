/**
 * Реализовать простой калькулятор
*/
import java.util.Scanner;
public class TaskThird {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numb_a = in.nextInt();
        System.out.print("Введите второе число: ");
        int numb_b = in.nextInt();
        System.out.println("Введите операцию + - / *: ");
        char operation;
        operation = in.next().charAt(0);
        int res;
        switch (operation) {
            case '+':
                res = numb_a + numb_b;
                System.out.printf("Результат: %d",res);
                break;
            case '-':
                res = numb_a - numb_b;
                System.out.printf("Результат: %d",res);
                break;
            case '/':
                res = numb_a / numb_b;
                System.out.printf("Результат: %d",res);
                break;
            case '*':
                res = numb_a * numb_b;
                System.out.printf("Результат: %d",res);
                break;

        }
        in.close();
    }

    
}
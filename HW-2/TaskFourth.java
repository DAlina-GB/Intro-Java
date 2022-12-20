import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class TaskFourth {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = iScanner.nextInt();
        System.out.println("Введите операцию + - / *: ");
        char op;
        op = iScanner.next().charAt(0);
        int res = 0;


        switch (op) {
            case '+':
                res = a + b;
                System.out.printf("Result: %d",res);
                break;
            case '-':
                res = a - b;
                System.out.printf("Result: %d",res);
                break;
            case '/':
                res = a / b;
                System.out.printf("Result: %d",res);
                break;
            case '*':
                res = a * b;
                System.out.printf("Result: %d",res);
                break;
        }
        makeLog(a + " " + op + " " + b + " = " + res);
        iScanner.close();
    }
    
        public static void makeLog(String res) {

            Logger logger = Logger.getLogger("calc");
            FileHandler fh;
    
            try {
                fh = new FileHandler("calc.log");
                logger.addHandler(fh);
                SimpleFormatter formatter = new SimpleFormatter();
                fh.setFormatter(formatter);
    
    
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    
            logger.info("\nРезультат выражения:\n" + res);
    
        }
}

/**
 * Вывести все простые числа от 1 до 1000
*/
public class TaskSecond {
    public static void main(String[] args) {
        boolean b = true;
        for (int q = 2; q <= 1000; q++) {
            for (int i = 2; i < q; i++) {
                if (q % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(q);
            else b = true;
        }
    }
}

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class task3 {
    public static void main(String[] args) {
        Random rndNumb = new Random();
        int capacity = 25;
        int minNumb, maxNumb;
        float averNumb = 0;
        ArrayList<Integer> listNumb = new ArrayList<Integer>(capacity);
        for (int i = 0; i < capacity; i++) {
            listNumb.add(rndNumb.nextInt(100));
            averNumb = averNumb + listNumb.get(i);
        }
        System.out.println("Исходный список случайных чисел равен: ");
        System.out.println(listNumb);
        Collections.sort(listNumb);
        System.out.println("Отсортированный список имеет вид: ");
        System.out.println(listNumb);
        minNumb = listNumb.get(0);
        maxNumb = listNumb.get(capacity - 1);
        System.out.println("Сумма чисел списка = " + averNumb);
        averNumb = averNumb / capacity;
        System.out.println("Минимальный элемент списка = " + minNumb);
        System.out.println("Максимальный элемент списка = " + maxNumb);
        System.out.println("Среднееарифметическое списка = " + averNumb);
    }
}

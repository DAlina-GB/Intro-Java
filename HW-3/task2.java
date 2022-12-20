import java.util.Random;
import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        Random rndNumb = new Random();
        int capacity = 25;
        ArrayList<Integer> listNumb = new ArrayList<Integer>(capacity);
        ArrayList<Integer> listEvenNumb = new ArrayList<Integer>(capacity);
        for (int i = 0; i < capacity; i++) {
            listNumb.add(rndNumb.nextInt(100));
        }
        System.out.println("Исходный массив случайных чисел равен: ");
        System.out.println(listNumb);
        for (int i = 0; i < capacity; i++) {
            if ((listNumb.get(i) % 2) == 0) {
                listEvenNumb.add(listNumb.get(i));
            }
        }
        listNumb.removeAll(listEvenNumb);
        System.out.println("Исходный массив после удаления всех четных чисел: ");
        System.out.println(listNumb);
    }
    
}

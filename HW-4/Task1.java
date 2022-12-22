import java.util.LinkedList;

public class Task1 {
    public static void ReversLinkedList(LinkedList<Integer> ll) {
        System.out.print("Перевёрнутый список -> [");
        for (int i = ll.size() - 1; i >= 1; i--) {
            System.out.print(ll.get(i) + ", ");
        }
        System.out.print(ll.get(0) + "]"); // что бы убрать запятую в конце

    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            ll.add(0, i);
        }
        System.out.println("Обычный список -> " + ll);
        ReversLinkedList(ll);
    }
}
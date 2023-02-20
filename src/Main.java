import java.io.IOException;
import java.util.*;

class main {
    public static void main(String[] args) {
        // ex0();
        ex1();
        //ex2();
    }

    public static void ex0() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(1);
        list.add(4);
        System.out.println(list);
        int size = list.size();
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list1.addFirst(list.pop());
        }

        System.out.println(list1);
    }

    public static void ex1() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Наша очередь " + list);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбери категорию:\n" +
                "1 : enqueue()\n" +
                "2 : dequeue()\n" +
                "3 : first()");
        try {
            int choice = scanner.nextInt();
            switch (choice) {
                case (1):
                    System.out.println("Выберите элемент который нужно поставить в конец очереди");
                    int choice1 = scanner.nextInt() - 1;
                    int item1 = list.remove(choice1);
                    list.add(choice1 + 1);
                    System.out.println(list);
                case (2):
                    System.out.println("Вернули " + list.pop());
                    System.out.println(list);
                case (3):
                    System.out.println("Вернули "+ list.getFirst());
                    System.out.println(list);

            }
        } catch (Exception ex) {
            System.out.println("Введено не число, попробуй Shift+F10");
        }

    }

    public static void ex2() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(1);
        list.add(4);
        System.out.println(list);
        int sum = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = (int) iterator.next();
            sum += num;
        }
        System.out.println(sum);
    }
}

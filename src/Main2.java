import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        CustomClass cc = new CustomClass(10, 20, array, 'A');

        System.out.println("Natural order:");
        for (int i : cc) {
            System.out.println(i);
        }

        System.out.println("Mixed order:");
        Iterator<Integer> mixedIterator = cc.mixedOrderIterator();
        while (mixedIterator.hasNext()) {
            System.out.println(mixedIterator.next());
        }

        System.out.println("Odd-Even order:");
        Iterator<Integer> oddEvenIterator = cc.oddEvenOrderIterator();
        while (oddEvenIterator.hasNext()) {
            System.out.println(oddEvenIterator.next());
        }
    }
}

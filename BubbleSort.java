import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
    public static <E> void bubleSort(E[] list, Comparator<? super E> comparator) {
        int n = list.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (comparator.compare(list[j - 1], list[j]) > 0) {
                    E temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] testArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:  " + Arrays.toString(testArray));

        bubleSort(testArray, Comparator.naturalOrder());
        System.out.println("Ascending:       " + Arrays.toString(testArray));

        bubleSort(testArray, Comparator.reverseOrder());
        System.out.println("Descending:      " + Arrays.toString(testArray));
        System.out.println();

        String[] words = {"pear", "apple", "cherry", "banana"};
        System.out.println("Original array:  " + Arrays.toString(words));
        bubleSort(words, Comparator.naturalOrder());
        System.out.println("Alphabetical:    " + Arrays.toString(words));

        bubleSort(words, Comparator.comparingInt(String::length));
        System.out.println("By length:       " + Arrays.toString(words));
    }
}

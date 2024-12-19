import java.util.Comparator;

public class task1 {
    public static int array_size, min, index;

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array_size = array.length;
            int min_Index = HelperGetMinIndex(array, i, array_size);
            HelperSwap(array, i, min_Index);
        }
    }

    public static int HelperGetMinIndex(int[] array, int from, int to) {
        min = 100;
        index = 0;

        for (int i = from ; i < to; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void HelperSwap(int[] array, int posA, int posB) {
        int aux = array[posA];
        array[posA] = array[posB];
        array[posB] = aux;
    }

    public static <T> void sort(int[] array, Comparator<T> reverseOrder) {
    }
}

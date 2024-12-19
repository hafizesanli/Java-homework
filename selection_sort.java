public class selection_sort {
    public static int array_size, min, index;

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array_size = array.length;
            int min_Index = helper_get_min_index(array, i, array_size);
            helper_swap(array, i, min_Index);
        }
    }

    public static int helper_get_min_index(int[] array, int from, int to) {
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
    public static void helper_swap(int[] array, int posA, int posB) {
        int aux = array[posA];
        array[posA] = array[posB];
        array[posB] = aux;
    }
}

public class LinearSearch {

    /**
     * Searches for a value in an array using linear search.
     *
     * @param a the array
     * @param value the value to search for
     * @return index if found, -1 otherwise
     */
    public static int search(int[] a, int value) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return i;
            }
        }

        return -1; // value not found
    }
}

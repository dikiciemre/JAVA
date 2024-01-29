package LinearSearch;

public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {2, 7, 1, 23, 8, 14, 5};

        int target = 8;
        int result = linearSearch(array, target);

        if (result == -1) {
            System.out.println(target + " not found in the array.");
        } else {
            System.out.println(target + " found at index " + result);
        }
    }

    public static int linearSearch(int[] array, int target) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                return i; // Hedef eleman bulunduğunda indeksi döndür
            }
        }

        return -1; // Hedef eleman bulunamadığında -1 döndür
    }
}

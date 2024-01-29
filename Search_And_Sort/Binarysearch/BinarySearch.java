package Binarysearch;
public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 5, 8, 12, 14, 23, 25, 30};

        int target = 14;
        int result = binarySearch(sortedArray, target);

        if (result == -1) {
            System.out.println(target + " not found in the array.");
        } else {
            System.out.println(target + " found at index " + result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid; // Hedef eleman bulunduğunda indeksi döndür
            } else if (array[mid] < target) {
                low = mid + 1; // Hedef eleman sağ tarafta aranmalı
            } else {
                high = mid - 1; // Hedef eleman sol tarafta aranmalı
            }
        }

        return -1; // Hedef eleman bulunamadığında -1 döndür
    }
}

# Merge Sort Algoritması

Bu Java programı, Merge Sort (Birleştirme Sıralama) algoritmasını göstermektedir. Merge Sort, bir sıralama algoritmasıdır ve bir diziyi iki parçaya böler, her parçayı sıralar ve ardından sıralı parçaları birleştirir.

## Nasıl Çalışır?

1. **mergeTwoSortedArray Metodu:**
    - İki sıralı diziyi birleştiren metoddur.
    - İki diziyi sıralı birleştirip yeni bir diziyi oluşturur.

2. **mergeSort Metodu:**
    - Diziyi ikiye böler ve her iki parçayı ayrı ayrı sıralar.
    - Sıralı parçaları birleştirip sonuç dizisini oluşturur.

3. **Programın İşleyişi:**
    - `mergeSort` metodu, verilen diziyi sıralar ve sonucu ekrana yazdırır.

4. **Örnek Kullanım:**
    - Verilen bir dizi: `[66, 31, 13, 22, 19, 99, 198, 15]`.
    - Program bu diziyi Merge Sort algoritması kullanarak sıralar.

## Kod Açıklaması

```java
public class MergeSort {

    static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        // İki sıralı diziyi birleştiren metot
        // ...
    }

    static int[] mergeSort(int[] arr, int low, int high) {
        // Diziyi ikiye bölen ve birleştiren metot
        // ...
    }

    public static void main(String[] args) {
        int[] test = new int[] { 66, 31, 13, 22, 19, 99, 198, 15 };

        int[] result = mergeSort(test, 0, test.length - 1);
        for (int element : result) {
            System.out.print(element + " ");
        }
    }

}

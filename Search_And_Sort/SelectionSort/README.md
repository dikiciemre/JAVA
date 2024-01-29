# Selection Sort Algoritması

Bu Java programı, Selection Sort (Seçmeli Sıralama) algoritmasını göstermektedir. Selection Sort, bir diziyi sıralamak için her adımda dizinin en küçük (veya en büyük) elemanını bulur ve bu elemanı uygun konuma yerleştirir.

## Nasıl Çalışır?

1. **selectionSort Metodu:**
    - Diziyi sıralayan ana metottur.
    - Dizi üzerinde gezinerek her adımda en küçük elemanı seçer ve uygun konuma yerleştirir.

2. **Programın İşleyişi:**
    - Diziyi sıralamadan önce ve sonra durumu ekrana yazdırır.

3. **Örnek Kullanım:**
    - Verilen bir dizi: `[64, 25, 12, 22, 11]`.
    - Program bu diziyi Selection Sort algoritması kullanarak sıralar.

## Kod Açıklaması

```java
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Sıralama öncesi:");
        printArray(array);

        selectionSort(array);

        System.out.println("\nSıralama sonrası:");
        printArray(array);
    }

    public static void selectionSort(int[] array) {
        // Diziyi sıralayan metot
        // ...
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

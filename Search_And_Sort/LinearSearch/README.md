# Lineer Arama Algoritması

Bu Java programı, Lineer Arama algoritmasını göstermektedir. Lineer Arama, bir listede sırasıyla her elemanı kontrol ederek eşleşme bulana kadar veya liste tamamen taranana kadar devam eden basit bir arama algoritmasıdır.

## Lineer Arama Nasıl Çalışır

1. **Başlangıç:**
    - Diziyi ve aranacak hedef elemanı giriş olarak alır.

2. **Lineer Arama Algoritması:**
    - Dizideki her elemanı sırayla kontrol et.
    - Mevcut elemanı hedef elemanla karşılaştır.
    - Eğer bir eşleşme bulunursa, elemanın indeksini döndür.
    - Eğer tüm dizi taranır ve hedef bulunmazsa, -1 döndür.

3. **Örnek Kullanım:**
    - Verilen bir dizi [2, 7, 1, 23, 8, 14, 5] ve hedef eleman 8.
    - Program lineer arama yapar ve hedefin bulunup bulunmadığını ve indeksini ekrana yazdırır.

## Kod Açıklaması

```java
public class LinearSearch {

    public static void main(String[] args) {
        int[] array = {2, 7, 1, 23, 8, 14, 5};

        int target = 8;
        int result = linearSearch(array, target);

        if (result == -1) {
            System.out.println(target + " dizide bulunamadı.");
        } else {
            System.out.println(target + " elemanı " + result + " indeksinde bulundu.");
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






### English README

```markdown
# Linear Search Algorithm

This Java program demonstrates the Linear Search algorithm. Linear Search is a simple search algorithm that sequentially checks each element in a list until a match is found or the whole list has been searched.

## How Linear Search Works

1. **Start:**
    - Accept the array as input and the target element to search.

2. **Linear Search Algorithm:**
    - Iterate through each element in the array.
    - Compare the current element with the target element.
    - If a match is found, return the index of the element.
    - If the entire array is searched and the target is not found, return -1.

3. **Example Usage:**
    - Given an array [2, 7, 1, 23, 8, 14, 5] and a target element 8.
    - The program performs a linear search and prints whether the target is found and its index.

## Code Explanation

```java
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
                return i; // Return the index when the target is found
            }
        }

        return -1; // Return -1 when the target is not found
    }
}

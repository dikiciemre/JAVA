# Binary Search Algorithm

Binary search, sıralı bir dizide hedef bir elemanı bulmak için kullanılan etkili bir algoritmadır. Algoritma, dizinin ortasındaki elemanı hedefle karşılaştırır ve hedef, ortadaki elemandan büyükse ya da küçükse, diziyi yarıya indirir. Bu işlem, hedef eleman bulunana kadar ya da dizinin tamamı kontrol edilene kadar tekrarlanır.

## Algoritma Adımları

1. **Başlangıç:**
    - Diziyi sıralı olarak kabul edin.
    - Başlangıçta, alt sınır (`low`) dizinin başlangıcını, üst sınır (`high`) ise dizinin sonunu gösterir.

2. **Orta Elemanı Bulma:**
    - `low` ve `high` arasındaki orta elemanı (`mid`) bulun: `mid = (low + high) / 2`

3. **Hedefle Karşılaştırma:**
    - Hedef eleman ile orta elemanı karşılaştır:
        - Eğer hedef eleman, orta elemandan küçükse, `high = mid - 1`
        - Eğer hedef eleman, orta elemandan büyükse, `low = mid + 1`
        - Eğer hedef eleman, orta elemana eşitse, hedef eleman bulunmuştur, indeksi döndür.

4. **Yineleme:**
    - Yukarıdaki adımları, hedef eleman bulunana kadar veya `low` ≥ `high` olduğunda tekrarlayın.

5. **Sonuç:**
    - Hedef eleman bulunursa, bulunan elemanın indeksini döndürün.
    - Hedef eleman bulunamazsa, -1 döndürün.

## Örnek

```java
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


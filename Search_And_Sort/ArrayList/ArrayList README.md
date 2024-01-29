# ArrayList Example

Bu örnek, Java'daki `ArrayList` sınıfını kullanarak dinamik bir dizi oluşturmayı, eleman eklemeyi, belirli bir indekse eleman eklemeyi ve elemanları silmeyi göstermektedir.

## ArrayList Nedir?

`ArrayList`, Java'da dinamik bir dizi olarak kullanılan bir sınıftır. Dinamik bir dizi olduğu için boyutu dinamik olarak değiştirilebilir.

## Örnek Kullanım

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList Oluşturma
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Eleman Ekleme
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        // ArrayList'i Yazdırma
        System.out.println("\nArrayList Elemanları: " + arrayList);

        // Belirli Bir İndekse Eleman Ekleme
        arrayList.add(2, 5);

        // ArrayList'i Yazdırma
        System.out.println("\nArrayList Elemanları (İndekse Ekleme): " + arrayList);

        // Belirli Bir Elemanı Silme
        arrayList.remove(Integer.valueOf(3));

        // ArrayList'i Yazdırma
        System.out.println("\nArrayList Elemanları (Eleman Silme): " + arrayList);

        // Belirli Bir İndeksteki Elemanı Silme
        arrayList.remove(2);
        System.out.println("\nArrayList Elemanları (2. İndex'i Silme): " + arrayList);
    }
}

# HashMap Kullanımı

Bu Java programı, HashMap kullanımını göstermektedir. HashMap, anahtar-değer çiftleri üzerinde çalışan etkili bir veri yapısıdır.

## Nasıl Çalışır?

1. **HashMap Oluşturma:**
    - `HashMap` sınıfından bir nesne oluşturulur.

2. **Anahtar-Değer Ekleme:**
    - `put` metodu ile anahtar-değer çiftleri eklenir.

3. **Hash Tablosunu Yazdırma:**
    - `System.out.println("Hash Tablosu: " + hashMap);` ile hash tablosu ekrana yazdırılır.

4. **Belirli Bir Anahtarın Değerini Alma:**
    - `get` metodu ile belirli bir anahtarın değeri alınır.

5. **Belirli Bir Anahtarı Silme:**
    - `remove` metodu ile belirli bir anahtar ve değeri silinir.

6. **Hash Tablosunu Yeniden Yazdırma:**
    - Silinen anahtarın ardından hash tablosu tekrar ekrana yazdırılır.

## Kod Açıklaması

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMap oluştur
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Anahtar-değer ekle
        hashMap.put("Elma", 10);
        hashMap.put("Kahve", 20);
        hashMap.put("Şeker", 30);

        // Hash tablosunu yazdır
        System.out.println("Hash Tablosu: " + hashMap);

        // Belirli bir anahtarın değerini al
        String arananAnahtar = "Kahve";
        if (hashMap.containsKey(arananAnahtar)) {
            int deger = hashMap.get(arananAnahtar);
            System.out.println(arananAnahtar + " anahtarının değeri: " + deger);
        } else {
            System.out.println(arananAnahtar + " anahtarı bulunamadı.");
        }

        // Belirli bir anahtarı sil
        String silinecekAnahtar = "Elma";
        if (hashMap.containsKey(silinecekAnahtar)) {
            hashMap.remove(silinecekAnahtar);
            System.out.println(silinecekAnahtar + " anahtarı silindi.");
        } else {
            System.out.println(silinecekAnahtar + " anahtarı bulunamadı.");
        }

        // Hash tablosunu yazdır
        System.out.println("Hash Tablosu (silinecek anahtar çıkarıldı): " + hashMap);
    }
}

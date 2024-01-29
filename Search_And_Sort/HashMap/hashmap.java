package HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
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


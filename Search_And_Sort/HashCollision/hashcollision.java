package HashCollision;

import java.util.HashMap;
import java.util.Map;

public class hashcollision {
    public static void main(String[] args) {
        // HashMap oluştur
        Map<String, Integer> hashMap = new HashMap<>();

        // Çakışan hash değerine sahip anahtarlar ekleyelim
        hashMap.put("ABC", 1);
        hashMap.put("BCA", 2);

        // Anahtarlar ve değerleri yazdır
        System.out.println("Hash Map: " + hashMap);
    }
}


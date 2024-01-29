package ArrayList;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // ArrayList oluştur
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Eleman ekle
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        // ArrayList'i yazdır
        System.out.println("\nArrayList Elemanları: " + arrayList);

        // Belirli bir indekse eleman ekle
        arrayList.add(2, 5);

        // ArrayList'i yazdır
        System.out.println("\nArrayList Elemanları (indekse ekleme): " + arrayList);

        // Belirli bir elemanı sil
        arrayList.remove(Integer.valueOf(3));

        // ArrayList'i yazdır
        System.out.println("\nArrayList Elemanları (eleman silme): " + arrayList);

        arrayList.remove(2);
        System.out.println("\nArraylist Elemanları(2. indexi sildi):" + arrayList);

    }
}

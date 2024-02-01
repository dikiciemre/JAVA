# EncapsulationExample

Bu örnek proje, Java dilinde encapsulation (kapsülleme) kavramını göstermektedir.

## Encapsulation Nedir?

Encapsulation, bir sınıf içindeki veriye erişimi kontrol etmek ve korumak amacıyla kullanılan bir nesne yönelimli programlama prensibidir. Bu prensibe göre, sınıfın içindeki verilere doğrudan erişim yerine, erişimi kontrol eden get ve set metodları kullanılır.

## Örnek: Çalışan (Employee) Sınıfı

```java
// Çalışan (Employee) sınıfı tanımı
public class Employee {
    private String name;
    private int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter ve setter metotları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Hatalı yaş değeri.");
        }
    }
}

// Ana sınıf
public class Main {
    public static void main(String[] args) {
        // Çalışan nesnesi oluşturma
        Employee employee = new Employee("Ahmet", 25);

        // Getter ve setter kullanımı
        System.out.println("Çalışan Adı: " + employee.getName());
        System.out.println("Çalışan Yaşı: " + employee.getAge());

        // Yaş değerini güncelleme
        employee.setAge(30);

        // Güncellenmiş yaş değerini alma
        System.out.println("Güncellenmiş Çalışan Yaşı: " + employee.getAge());
    }
}

# AbstractClassExample

Bu örnek proje, Java dilinde abstract sınıfların kullanımını göstermektedir.

## Abstract Sınıf Nedir?

Java'da abstract sınıflar, tamamlanmamış (implemente edilmemiş) metotları içeren ve nesne oluşturulamayan sınıflardır. Bu sınıflar genellikle ortak özelliklere sahip alt sınıflar için bir şablondur.

## Örnek: Şekil (Shape) Abstract Sınıfı

```java
// Abstract sınıf tanımı
abstract class Shape {
    // Soyut metot tanımı
    public abstract double calculateArea();

    // Somut metot
    public void display() {
        System.out.println("Bu bir şekildir.");
    }
}

// Shape sınıfından türetilen bir alt sınıf
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Soyut metodu implement etme
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Ana sınıf
public class Main {
    public static void main(String[] args) {
        // Abstract sınıftan nesne oluşturulamaz
        // Shape shape = new Shape(); // Hata!

        // Alt sınıflardan nesne oluşturulabilir
        Circle circle = new Circle(5);
        System.out.println("Daire Alanı: " + circle.calculateArea());
        circle.display();
    }
}

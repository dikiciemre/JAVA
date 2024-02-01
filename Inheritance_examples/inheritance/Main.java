package inheritance;

public class Main {
    public static void main(String[] args) {

        employee employee1 = new employee(13,"Emre Dikici");

        professor professor1 = new professor(23,"Mustafa Dikici","dekan"); // kalıtım alan sınıf üst sınıfın özelliklerini kullandı
        professor1.enter();
        professor1.goLesson();

        worker worker1 = new worker(13,"İbo tatlıses",6);
        worker1.clean();
    }
}

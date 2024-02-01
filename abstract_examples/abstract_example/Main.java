package abstract_example;

public class Main {
    public static void main(String[] args) {

        animal misa = new cat();
        animal pasa = new bird();

        misa.run();
        misa.fly();

        pasa.run();
        pasa.fly();

    }
}

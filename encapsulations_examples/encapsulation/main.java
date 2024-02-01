package encapsulation;

public class main {
    public static void main(String[] args) {

        book HarryPotter = new book("Harry potter" , 124);
        book SherlockHolmes = new book("Sherlock Holmes", 456);

        System.out.println(HarryPotter.getName());
        System.out.println(SherlockHolmes.getPage_number());



    }
}

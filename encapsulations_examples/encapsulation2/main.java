package encapsulation2;

public class main {
    public static void main(String[] args){

        vet cat_misa = new vet("misa",7);
        vet bird_pasa = new vet("pasa" , 6);


        System.out.println(cat_misa.getAge());
        System.out.println(bird_pasa.getName());
    }
}

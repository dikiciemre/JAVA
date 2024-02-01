package interfacee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("enter your price : ");
        double price = input.nextDouble();

        System.out.print("enter your card number : ");
        String card_number = input.next();

        System.out.print("enter your date : ");
        String date = input.next();

        System.out.print("enter your cvc : ");
        String cvc= input.next();


        System.out.println("1-Garanti \n2-akbank");
        System.out.println("select your bank !");
        int select = input.nextInt();

        if(select == 1) {
            Garanti garanti = new Garanti("garanti bankası");
            garanti.connect("123241");
            garanti.payment(price, card_number, date, cvc);
        } else if (select == 2) {
            akbank akbank = new akbank("Akbank");
            akbank.connect("123241");
            akbank.payment(price,card_number,date,cvc);
        }else{
                System.out.println("ERROR");
        }

    }
}

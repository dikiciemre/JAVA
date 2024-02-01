package interfacee;

public class Garanti implements Ibank{
    String bank_name;
    int id;

    public Garanti(String bank_name) {
        this.bank_name = bank_name;
        this.id = id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


@Override
    public boolean connect(String ipAdress){
        System.out.println("kulanıcı ip : " + ipAdress);
        System.out.println("makine ip : " + this.Host_ip);
    System.out.println(this.bank_name + " worked !");
    return true;
    }

    @Override
    public boolean payment(double price,String card_number, String date,String cvc){
        System.out.println("Congratulations");
        return true;
    }


}

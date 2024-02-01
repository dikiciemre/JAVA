package interfacee;

public interface Ibank {


    final String Host_ip = "98765";
    public boolean connect(String ipAdress);

    public boolean payment(double price,String card_number, String date,String cvc);
}

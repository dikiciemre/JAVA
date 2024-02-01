package inheritance;

public class employee {

    private String name_surname;

    private int id;

    public employee(int id,String name_surname) { // constructor tanımlandı
        this.id = id;
        this.name_surname = name_surname;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public void enter(){
        System.out.println(this.name_surname + " entered.");
    }

    public void exit(){
        System.out.println(this.name_surname + " exited.");
    }
}

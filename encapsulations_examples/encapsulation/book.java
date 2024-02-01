package encapsulation;

public class book {

    private String name;
    private int page_number;


    public book(String name , int page_number){
        this.name = name;
        this.page_number = page_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

}

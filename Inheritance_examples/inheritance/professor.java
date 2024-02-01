package inheritance;

public class professor extends employee{

    private String level;
    public professor(int id, String name_surname,String level) {
        super(id, name_surname);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void goLesson(){
        System.out.println(this.getName_surname() + " went lesson");
    }
}

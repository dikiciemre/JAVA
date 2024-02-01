package inheritance;

public class worker extends employee{

    private int  hours;

    public worker(int id, String name_surname, int hours) {
        super(id, name_surname);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    public void clean(){
        System.out.println(this.getName_surname() + " cleaned floors in " + this.hours + " hours.");
    }
}

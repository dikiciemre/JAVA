package abstract_method;

public abstract class worker extends employee {

    private int  hours;

    public worker(int id, String name_surname, String hours) {
        super(id, name_surname);
        this.hours = Integer.parseInt(hours);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    public abstract void clean();

    public abstract void clean(int tea);
}


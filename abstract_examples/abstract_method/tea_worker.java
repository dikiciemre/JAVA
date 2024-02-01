package abstract_method;

public class tea_worker extends worker{

    private int tea_count;

    public tea_worker(int id, String name_surname, String level, int tea_count) {
        super(id, name_surname, level);
        this.tea_count = tea_count;
    }

    public int getTea_count() {
        return tea_count;
    }

    public void setTea_count(int tea_count) {
        this.tea_count = tea_count;
    }

    @Override
    public void clean() {

    }

    @Override
    public void clean(int tea){
        System.out.println( this.getName_surname() + "drink " + tea);
    }

}

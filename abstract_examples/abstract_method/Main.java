package abstract_method;



public class Main {
    public static void main(String[] args) {
       employee employee1 = new employee(13,"Emre Dikici");


       tea_worker teaWorker1 = new tea_worker(1,"ekrem imamoğlu ", "çay maker",9);
       teaWorker1.clean(4);

    }
}

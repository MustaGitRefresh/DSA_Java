public class Worker {

    String name;
    double basic;

    Worker(String n, double b){
        name = n;
        basic = b;
    }

    void display(){
        System.out.println("The basic details are as follows");
        System.out.println("Name " + name);
        System.out.println("Basic " + basic);
    }

}


class Wages extends Worker{
    int hrs;
    int rate;
    double wage;

    Wages(int h, int r, double w, String n, double b){
        super(n, b);
        hrs = h;
        rate = r;
        wage = w;
    }
    double overtime(){
        return hrs * rate;
    }
    void display(){
        System.out.println("The details are");
        System.out.println("The name is " + name);
        System.out.println("The wage is " + (overtime() + basic));
    }
}
public class Employee {
    int empn;
    double bsal;

    Employee(){
        empn = 0;
        bsal = 0;
    }

    Employee(int e, double b){
        empn = e;
        bsal = b;
    }

    void salinfo(){
        System.out.println("The value of empn is " + empn + " " + "and value of salary is " + bsal);
    }
}

class Salary extends Employee{
        float da;
        float hra;
        float spl;
        float tsal;

        Salary(){
            da = 0;  hra = 0; spl = 0; tsal = 0;
        }
        Salary(float d, float h, float s){
            da = d;
            hra = h;
            spl = s;
        }

        float calculate_sal(){
            tsal = (float)bsal + da + hra + spl;
            return tsal;
        }

        void show_sal(){
            System.out.println("The outputs are");
            System.out.println(da);
            System.out.println(hra);
            System.out.println(spl);
            System.out.println(tsal);
        }
}




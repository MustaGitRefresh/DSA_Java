import jdk.jshell.JShell;

public class Shelf {
    double[] ele;
    int lim, rear,front;

    Shelf(int n){
        lim = n;
        rear = -1;
        front = -1;
        ele = new double[lim];
    }
    void push(double data){
        if(rear == lim-1){
            System.out.println("The shelf is full");
            return;
        }
        else if(rear == -1 && front == -1){
            front++;
            rear++;
            ele[rear] = data;
        }
        else{
            rear++;
            ele[rear] = data;
        }
    }
    double pop(){
        if(rear == -1){
            System.out.println("The shelf is empty");
            return 999.99;
        }
        double val = ele[front];
        front++;
        return val;
    }
    void display(){
        for(int i=0;i<=rear;i++){
            System.out.println(ele[i]);
        }
    }

    public static void main(String[] args) {
        Shelf self = new Shelf(3);
        self.push(1.26);
        self.push(2.26);
        self.push(3.26);
        System.out.println(self.pop());
        self.display();
    }
}

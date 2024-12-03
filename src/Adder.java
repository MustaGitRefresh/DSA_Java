import java.util.Scanner;

import org.xml.sax.SAXException;

public class Adder {
    int a[];

    Adder() {
        a = new int[2];
    }

    void readTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hours");
        a[0] = Integer.parseInt(sc.nextLine());
        System.out.println("Minutes");
        a[1] = Integer.parseInt(sc.nextLine());
        // sc.close(); this cause to close input stream.
    }

    void addTime(Adder X, Adder Y) {
        this.a[0] = X.a[0] + Y.a[0];
        this.a[1] = X.a[1] + Y.a[1];
        this.a[0] += this.a[1] / 60;
        this.a[0] %= 24;
        this.a[1] %= 60;
    }

    void display_time() {
        System.out.print(a[0] + " hour(s) ");
        System.out.println(a[1] + " minute(s)");
    }

    public static void main(String[] args) {
        Adder x = new Adder();
        System.out.println("Time A");
        x.readTime();
        Adder y = new Adder();
        System.out.println("Time B");
        y.readTime();
        Adder z = new Adder();
        z.addTime(x, y);
        z.display_time();
    }
}
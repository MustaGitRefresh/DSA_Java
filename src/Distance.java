import java.util.Scanner;

public class Distance extends Point{
    double midx,midy;

    void readPoint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        y1 = sc.nextInt();
        y2 = sc.nextInt();
        distance = sc.nextInt();
    }
    void FindDistance(){
        distance = Math.sqrt((Math.pow((x2-x1),2) + Math.pow((y2-y1), 2)));
    }

    void findMidPoint(){
        midx = ((x1+x2)/2);
        midy = ((y1+y2)/2);
    }
}

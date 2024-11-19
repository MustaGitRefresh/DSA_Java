public abstract class Point {
    double x1,x2,y1,y2,distance;

    Point(){
        x1 = 0;
        x2 = 0;
        y1 = 0;
        y2 = 0;
        distance = 0;
    }
    abstract void readPoint();
    abstract void FindDistance();
}



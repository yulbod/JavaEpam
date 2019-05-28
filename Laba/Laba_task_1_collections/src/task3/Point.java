package task3;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }

    public double distanceToPoint(Point anotherPoint){
        double distance = Math.sqrt(Math.pow((x - anotherPoint.x), 2) + Math.pow((y - anotherPoint.y), 2));
        return distance;
    }

    public String viewPoint(){
        return "x = " + x  + ", y = " + y;
    }
}

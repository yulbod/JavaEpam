package task1;


public class Triangle extends Shape {
    private float a;
    private float b;
    private float c;

    public Triangle(String color, float a, float b, float c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }
    public float getC() {
        return c;
    }
    public void setC(float c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", side A=" + a +
                ", side B=" + b +
                ", side C=" + c;
    }

    @Override
    public float calcArea() {
        float p = (a + b + c)/2;
        return (float)(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}

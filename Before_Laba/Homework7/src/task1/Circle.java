package task1;

public class Circle extends Shape {
    private float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }

    @Override
    public float calcArea() {
        return (float)Math.PI*radius*radius;
    }
}

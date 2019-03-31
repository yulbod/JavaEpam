package task1;

public class Rectangle extends Shape{
    private float width;
    private float height;

    public Rectangle(String color, float width, float height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width = " + width + ", height = " + height;
    }

    @Override
    public float calcArea() {
        return height*width;
    }
}

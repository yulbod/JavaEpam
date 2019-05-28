package task1;

public class Shape {
    private String color;
    //public Shape (){}

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName() +
                ", color=" + color;
    }

    public float calcArea(){
        return (float)0;
    }

}

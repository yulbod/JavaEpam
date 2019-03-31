package task1;

public class Main {

    public static final int QUANTITY_OF_TYPES = 3;

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle("white ", 12, 10);
        Rectangle rec2 = new Rectangle("yellow ", 10, 10);
        Rectangle rec3 = new Rectangle("blue  ", 1, 10);
        Rectangle rec4 = new Rectangle("brown ", 0, 10);

        Circle cir1 = new Circle("green", 10);
        Circle cir2 = new Circle("green", 10);
        Circle cir3 = new Circle("green", 10);

        Triangle tri1 = new Triangle("pink", 4, 3, 5);
        Triangle tri2 = new Triangle("black", 5, 3, 5);

        Shape[] shapes = new Shape[] {rec1, rec2, rec3, rec4, cir1, cir2, cir3, tri1, tri2};

        enterAllFigures(shapes);
        calcSumOfAreas(shapes);
        enterSumOfSpecialAreas(calcSumOfSpecialAreas(shapes));

    }

    public static void enterAllFigures(Shape[] shapes){
        if (shapes == null || shapes.length<=0)
            return;
        for (Shape shape: shapes) {
            System.out.println(shape.toString() + ", area of shape = " + shape.calcArea());
        }
    }

    public static void calcSumOfAreas(Shape[] shapes){
        if (shapes == null || shapes.length<=0)
            return;

        float sum = 0;
        for (Shape shape: shapes) {
            sum += shape.calcArea();
        }
        System.out.println("Sum of all areas of figures = " + sum);
    }


    public static float[] calcSumOfSpecialAreas(Shape[] shapes){
        if (shapes == null || shapes.length<=0)
            return null;
        float[] sumOfType = new float[QUANTITY_OF_TYPES];

        for (Shape shape: shapes) {
            if (shape instanceof Triangle){
                sumOfType[0] += shape.calcArea();
            }
            if (shape instanceof Rectangle){
                sumOfType[1] += shape.calcArea();
            }
            if (shape instanceof Circle){
                sumOfType[2] += shape.calcArea();
            }
        }
        return sumOfType;
    }

    public static void enterSumOfSpecialAreas(float[] sumOfType){
        if (sumOfType == null || sumOfType.length<=0)
            return;
        int i = 0;
        for (String str: new String[] {"Sum of areas of all Triangles = ",
                                        "Sum of areas of all Rectangle = ",
                                        "Sum of areas of all Circles = "} ) {

            System.out.println(str + sumOfType[i]);
            i++;
        }
    }

}

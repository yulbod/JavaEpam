package task3;

import java.lang.reflect.Array;
import java.util.List;

public class Triangle {
    private Point firstVertex, secondVertex, thirdVertex;

    public Triangle(Point firstVertex, Point secondVertex, Point thirdVertex) {
        if (!triangleExists(firstVertex, secondVertex, thirdVertex)) {
            throw new IllegalArgumentException("Such triangle doesn't exist!");
        }
        this.firstVertex = firstVertex;
        this.secondVertex = secondVertex;
        this.thirdVertex = thirdVertex;
    }

    private boolean triangleExists(Point firstVertex, Point secondVertex, Point thirdVertex){
        double[] lengthOfSides = getLengthOfSides(firstVertex, secondVertex, thirdVertex);
        double a = lengthOfSides[0], b = lengthOfSides[1], c = lengthOfSides[2];
        if ((a+b) == c || (a+c) == b || (b+c) == a) return false;
        return true;
    }

    public double[] getLengthOfSides(Point firstVertex, Point secondVertex, Point thirdVertex){
        double a, b, c;
        a = firstVertex.distanceToPoint(secondVertex);
        b = secondVertex.distanceToPoint(thirdVertex);
        c = thirdVertex.distanceToPoint(firstVertex);
        double[] d = new double[] {a,b,c};
        return d;
    }

    public String showAllPoints(){
        return "\nfirst - " + firstVertex.viewPoint() + ",\n" +
                "second - " + secondVertex.viewPoint() + ",\n" +
                "third - " + thirdVertex.viewPoint() + ",";
    }

    public Point getFirstVertex() {
        return firstVertex;
    }
    public void setFirstVertex(Point firstVertex) {
        this.firstVertex = firstVertex;
    }

    public Point getSecondVertex() {
        return secondVertex;
    }
    public void setSecondVertex(Point secondVertex) {
        this.secondVertex = secondVertex;
    }

    public Point getThirdVertex() {
        return thirdVertex;
    }
    public void setThirdVertex(Point thirdVertex) {
        this.thirdVertex = thirdVertex;
    }

}

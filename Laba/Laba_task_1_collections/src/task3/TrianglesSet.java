package task3;


import java.util.HashSet;
import java.util.Set;

public class TrianglesSet {
    Set<Triangle> triangles;

    public TrianglesSet() {
        triangles = new HashSet<>();
    }

    public void fillSet(){
        Point first1 = new Point(3, 4);
        Point second1 = new Point(5, 8);
        Point third1 = new Point(1, 2);
        Triangle triangle1 = new Triangle(first1, second1, third1);

        triangles.add(triangle1);

        Point first2 = new Point(0, 0);
        Point second2 = new Point(0, 2);
        Point third2 = new Point(2, 0);
        Triangle triangle2 = new Triangle(first2, second2, third2);

        triangles.add(triangle2);
    }

    public void checkEveryInstance(){
        int i = 1;
        checkSetIsEmpty();
        for (Triangle triangle:
             triangles) {
            System.out.println("Triangle# " + i +
                    ", that have such points: " + triangle.showAllPoints() +
                    "\nis isosceles: " + isIsosceles(triangle) +
                    "\nis equilateral: " + isEquilateral(triangle) +
                    "\nis rightAngled: " + isRightAngled(triangle) +
                    "\nhas absolutely different length of sides: " + isDifferentAngled(triangle) +
                    ".\n ------------------------");
            i++;
        }
    }

    public boolean isDifferentAngled(Triangle triangle){        //разносторонний
        double[] lengthOfSides = triangle.getLengthOfSides(triangle.getFirstVertex(), triangle.getSecondVertex(), triangle.getThirdVertex());
        double a = lengthOfSides[0], b = lengthOfSides[1], c = lengthOfSides[2];
        if ((a != c && c != b && b != a ))
            return true;
        return false;
    }

    public boolean isIsosceles(Triangle triangle){      //равнобедренный
        double[] lengthOfSides = triangle.getLengthOfSides(triangle.getFirstVertex(), triangle.getSecondVertex(), triangle.getThirdVertex());
        double a = lengthOfSides[0], b = lengthOfSides[1], c = lengthOfSides[2];
        if ((a == c || c == b || b ==a ))
            return true;
        return false;
    }

    public boolean isEquilateral(Triangle triangle){    //равносторонний
        double[] lengthOfSides = triangle.getLengthOfSides(triangle.getFirstVertex(), triangle.getSecondVertex(), triangle.getThirdVertex());
        double a = lengthOfSides[0], b = lengthOfSides[1], c = lengthOfSides[2];
        if (a == c && c == b && b == a)
            return true;
        return false;
    }

    public boolean isRightAngled(Triangle triangle){    //прямоугольный
        double[] lengthOfSides = triangle.getLengthOfSides(triangle.getFirstVertex(), triangle.getSecondVertex(), triangle.getThirdVertex());
        double a = lengthOfSides[0], b = lengthOfSides[1], c = lengthOfSides[2];
        if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) ||
                (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) ||
                (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))
            return true;
        return false;
    }


    public void checkSetIsEmpty(){
        if(triangles.isEmpty()) {
            throw new IllegalArgumentException("Your set is empty!");
        }
    }
}

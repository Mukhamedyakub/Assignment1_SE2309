import action.Shape;
import action.Point;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/source");
        Scanner sc = new Scanner(file);
        int i = 0;

        Shape shape = new Shape();

        while (sc.hasNext()){
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            Point point = new Point(a, b);
            shape.addPoint(point);
        }

        System.out.println(shape);
    }
}

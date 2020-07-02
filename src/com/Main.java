package com;

import com.Point.Point_2D;
import com.Point.Point_3D;
import com.Shape_2D.Circle;
import com.Shape_2D.Rectangle;
import com.Shape_2D.Triangle;
import com.Shape_3D.Cuboid;
import com.Shape_3D.Sphere;
import com.Shape_3D.SquarePyramid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Rectangle(new Point_2D(5, 15.5), 10, 20));
        shapeList.add(new Circle(new Point_2D(0, 0), 1));
        shapeList.add(new Cuboid(new Point_3D(5, 5, 5), 10, 2, 3));
        shapeList.add(new Sphere(new Point_3D(8, 5, 3), 20));
        shapeList.add(new SquarePyramid(new Point_3D(2, 2, 2), 2, 2));
        shapeList.add(new Triangle(
                new Point_2D(0, 0),
                new Point_2D(5, 0),
                new Point_2D(2.5, 6)
        ));
        for (Shape item : shapeList) {
            System.out.println(item.toString());
        }
    }
}

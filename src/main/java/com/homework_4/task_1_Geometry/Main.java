package com.homework_4.task_1_Geometry;

import com.homework_4.task_1_Geometry.model.plane_shapes.Circle;
import com.homework_4.task_1_Geometry.model.plane_shapes.PlaneShape;
import com.homework_4.task_1_Geometry.model.plane_shapes.Rectangle;
import com.homework_4.task_1_Geometry.model.plane_shapes.Triangle;
import com.homework_4.task_1_Geometry.model.three_dimensional_shapes.Cuboid;
import com.homework_4.task_1_Geometry.model.three_dimensional_shapes.SpaceShape;
import com.homework_4.task_1_Geometry.model.three_dimensional_shapes.Sphere;
import com.homework_4.task_1_Geometry.model.three_dimensional_shapes.SquarePyramid;

public class Main {
    public static void main(String[] args) {
        PlaneShape planeShape = new PlaneShape();
        SpaceShape spaceShape = new SpaceShape();

        Triangle triangle = new Triangle(planeShape.getOne(), planeShape.getTwo(), planeShape.getThree());
        triangle.init();
        triangle.done();

        Rectangle rectangle = new Rectangle(planeShape.getFour(), 5, 10);
        rectangle.init();
        rectangle.done();

        Circle circle = new Circle(planeShape.getTwo(), 15);
        circle.init();
        circle.done();

        Cuboid cuboid = new Cuboid(spaceShape.getOne(), 5, 6, 10);
        cuboid.init();
        cuboid.done();

        SquarePyramid squarePyramid = new SquarePyramid(spaceShape.getTwo(), 4, 20);
        squarePyramid.init();
        squarePyramid.done();

        Sphere sphere = new Sphere(spaceShape.getThree(), 15);
        sphere.init();
        sphere.done();
    }
}
package com.homework_4.task_1_Geometry.model.three_dimensional_shapes;

import com.homework_4.task_1_Geometry.model.Shape;
import com.homework_4.task_1_Geometry.vertices.Vertices;

public class SpaceShape extends Shape {
    private Vertices one = new Vertices(0, 0, 0);
    private Vertices two = new Vertices(5, 0, 2);
    private Vertices three = new Vertices(2.5, 6, 3);

    public Vertices getOne() {
        return one;
    }

    public Vertices getTwo() {
        return two;
    }

    public Vertices getThree() {
        return three;
    }

    @Override
    public double getArea(double width) {
        return Math.pow(width, 2);
    }
}
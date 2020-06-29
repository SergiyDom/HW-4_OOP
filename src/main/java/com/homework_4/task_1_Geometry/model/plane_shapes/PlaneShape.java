package com.homework_4.task_1_Geometry.model.plane_shapes;

import com.homework_4.task_1_Geometry.model.Shape;
import com.homework_4.task_1_Geometry.vertices.Vertices;

public class PlaneShape extends Shape {
    private Vertices one = new Vertices(0, 0);
    private Vertices two = new Vertices(5, 0);
    private Vertices three = new Vertices(2.5, 6);
    private Vertices four = new Vertices(0, 10);

    public Vertices getOne() {
        return one;
    }

    public Vertices getTwo() {
        return two;
    }

    public Vertices getThree() {
        return three;
    }

    public Vertices getFour() {
        return four;
    }
}

package com.homework_4.task_1_Geometry.model.plane_shapes;

import com.homework_4.task_1_Geometry.vertices.Vertices;

public class Circle extends PlaneShape {
    private Vertices centr;
    private double radius;
    private double perimeter;
    private double area;

    public Circle(Vertices centr, double radius) {
        this.centr = centr;
        this.radius = radius;
    }

    public void init() {
        perimeter = getPerimeter(radius);
        area = getArea(radius);
    }

    public void done() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Circle {" +
                "centr = " + centr +
                "}, radius = " + radius +
                ", perimeter = " + perimeter +
                ", area = " + area +
                '}';
    }
}

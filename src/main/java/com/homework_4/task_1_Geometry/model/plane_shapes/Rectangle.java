package com.homework_4.task_1_Geometry.model.plane_shapes;

import com.homework_4.task_1_Geometry.vertices.Vertices;

public class Rectangle extends PlaneShape {
    private Vertices vertices;
    private double width;
    private double height;
    private double perimeter;
    private double area;

    public Rectangle(Vertices one, double width, double heidht) {
        this.vertices = one;
        this.width = width;
        this.height = heidht;
    }

    public void init() {
        perimeter = getPerimeter(width, height);
        area = getArea(width, height);
    }

    public void done() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "vertices = " + vertices +
                "}, width = " + width +
                ", height = " + height +
                ", perimeter = " + perimeter +
                ", area = " + area +
                '}';
    }
}

package com.homework_4.task_1_Geometry.Shape_2D;

import com.homework_4.task_1_Geometry.Point.Point_2D;

import static java.lang.Math.PI;

public class Circle extends PlaneShape {
    private double radius;

    public Circle(Point_2D a, double radius) {
        this.addVertic(a);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(PI * Math.pow(this.radius, 2) * 100) / 100.0;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * PI * this.radius * 100) / 100.0;
    }
}
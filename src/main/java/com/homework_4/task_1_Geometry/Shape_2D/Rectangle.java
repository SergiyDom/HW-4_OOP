package com.homework_4.task_1_Geometry.Shape_2D;

import com.homework_4.task_1_Geometry.Point.Point_2D;

public class Rectangle extends PlaneShape {
    private double width;
    private double height;

    public Rectangle(Point_2D a, double width, double height) {
        this.addVertic(a);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.round(this.width * this.height * 100) / 100.0;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * (this.height + this.width) * 100) / 100.0;
    }
}

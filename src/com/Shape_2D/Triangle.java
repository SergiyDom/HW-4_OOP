package com.Shape_2D;

import com.Point.Point_2D;

public class Triangle extends PlaneShape {

    public Triangle(Point_2D a, Point_2D b, Point_2D c) {
        this.addVertic(a);
        this.addVertic(b);
        this.addVertic(c);
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.round(Math.sqrt(p * (p - sideAB()) * (p - sideBC()) * (p - sideAC()))*100)/100.0;
    }

    @Override
    public double getPerimeter() {
        return Math.round((sideAB() + sideAC() + sideBC())*100)/100.0;
    }

    private double sideAB() {
        Point_2D A = (Point_2D) this.listVertices.get(0);
        Point_2D B = (Point_2D) this.listVertices.get(1);
        return this.SideLenght(A, B);
    }

    private double sideBC() {
        Point_2D B = (Point_2D) this.listVertices.get(1);
        Point_2D C = (Point_2D) this.listVertices.get(2);
        return this.SideLenght(B, C);
    }

    private double sideAC() {
        Point_2D A = (Point_2D) this.listVertices.get(0);
        Point_2D C = (Point_2D) this.listVertices.get(2);
        return this.SideLenght(A, C);
    }

}

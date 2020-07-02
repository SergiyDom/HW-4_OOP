package com.Shape_3D;

import com.Point.Point_3D;

import static java.lang.Math.PI;

public class Sphere extends SpaceShape {
    private double radius;

    public Sphere(Point_3D a, double radius) {
        this.addVertic(a);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(4*PI*Math.pow(this.radius,2)*100)/100.0;
    }

    @Override
    public double getVolume() {
        return Math.round(4/3.0*PI*Math.pow(this.radius,3)*100)/100.0;
    }
}
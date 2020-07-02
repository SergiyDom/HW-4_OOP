package com.homework_4.task_1_Geometry.Shape_3D;

import com.homework_4.task_1_Geometry.Point.Point_3D;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;

    public Cuboid(Point_3D a, double width, double height, double depth) {
        this.addVertic(a);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    private double frontArea() {
        return Math.round(this.width * this.height * 100) / 100.0;
    }

    private double bottomArea() {
        return Math.round(this.width * this.depth * 100) / 100.0;
    }

    private double sideArea() {
        return Math.round(this.depth * this.height * 100) / 100.0;
    }

    @Override
    public double getArea() {
        return 2 * (this.frontArea() + this.bottomArea() + this.sideArea());
    }

    @Override
    public double getVolume() {
        return this.width * this.height * this.depth;
    }
}

package com.Shape_3D;

import com.Point.Point_3D;

public class SquarePyramid extends SpaceShape {
    private double width;
    private double height;

    public SquarePyramid(Point_3D a, double width, double height) {
        this.addVertic(a);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double diagonal = this.width * Math.sqrt(2);
        double rebro = Math.sqrt(Math.pow(this.height, 2) + Math.pow(diagonal / 2, 2));

        return Math.round(Math.pow(this.width, 2) + 2 * this.width * Math.sqrt((Math.pow(rebro, 2) - (Math.pow(this.width, 2) / 4))) * 100) / 100.0;
    }

    @Override
    public double getVolume() {
        return Math.round(1 / 3.0 * Math.pow(this.width, 2) * this.height * 100) / 100.0;
    }
}
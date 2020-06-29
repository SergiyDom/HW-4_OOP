package com.homework_4.task_1_Geometry.model.three_dimensional_shapes;

import com.homework_4.task_1_Geometry.vertices.Vertices;

public class SquarePyramid extends SpaceShape {
    private Vertices vertices;
    private double width;
    private double height;
    private double area;
    private double volume;

    public SquarePyramid(Vertices vertices, double width, double height) {
        this.vertices = vertices;
        this.width = width;
        this.height = height;
    }

    public void init() {
        area = getArea(width);
        volume = getVolume(width, height);
    }

    public void done() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "SquarePyramid {" +
                "vertices = " + vertices + ", z=" + vertices.z +
                "}, width = " + width +
                ", height = " + height +
                ", base area = " + area +
                ", volume = " + volume +
                '}';
    }
}
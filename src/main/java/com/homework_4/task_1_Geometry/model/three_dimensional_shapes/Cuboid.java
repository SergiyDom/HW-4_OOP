package com.homework_4.task_1_Geometry.model.three_dimensional_shapes;

import com.homework_4.task_1_Geometry.vertices.Vertices;

public class Cuboid extends SpaceShape {
    private Vertices vertices;
    private double width;
    private double height;
    private double depth;
    private double area;
    private double volume;

    public Cuboid(Vertices vertices, double width, double height, double depth) {
        this.vertices = vertices;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void init() {
        area = getArea(width, height);
        volume = getVolume(width, height, depth);
    }

    public void done() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Cuboid {" +
                "vertices = " + vertices +
                "}, width = " + width +
                ", height = " + height +
                ", depth = " + depth +
                ", base area = " + area +
                ", volume = " + volume +
                '}';
    }
}

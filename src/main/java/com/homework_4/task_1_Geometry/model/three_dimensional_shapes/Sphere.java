package com.homework_4.task_1_Geometry.model.three_dimensional_shapes;

import com.homework_4.task_1_Geometry.vertices.Vertices;

public class Sphere extends SpaceShape {
    private Vertices vertices;
    private double radius;
    private double area;
    private double volume;

    public Sphere(Vertices vertices, double radius) {
        this.vertices = vertices;
        this.radius = radius;
    }

    public void init() {
        area = getArea(radius);
        volume = getVolume(radius);
    }

    public void done() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Sphere {" +
                "vertices = " + vertices +
                ", z=" + vertices.z +
                "}, radius = " + radius +
                ", area = " + area +
                ", volume = " + volume +
                '}';
    }
}
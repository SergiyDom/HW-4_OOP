package com.homework_4.task_1_Geometry.vertices;

public class Vertices {
    public double x;
    public double y;
    public double z;

    public Vertices(double z) {
        this.z = z;
    }

    public Vertices(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vertices(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vertices{" +
                "x=" + x +
                ", y=" + y;
    }
}

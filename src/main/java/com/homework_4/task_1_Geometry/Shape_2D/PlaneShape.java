package com.homework_4.task_1_Geometry.Shape_2D;


import com.homework_4.task_1_Geometry.Interfaces.AreaMeasurable;
import com.homework_4.task_1_Geometry.Interfaces.PerimeterMeasurable;
import com.homework_4.task_1_Geometry.Point.Point_2D;
import com.homework_4.task_1_Geometry.Point.Vertics;
import com.homework_4.task_1_Geometry.Shape;

public class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    protected void addVertic(Point_2D point) {
        this.listVertices.add(point);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    protected double SideLenght(Point_2D one, Point_2D two) {
        return Math.sqrt(Math.pow(one.getX() - two.getX(), 2) + Math.pow(one.getY() - two.getY(), 2));
    }

    private String getVertices() {
        String str = "";
        for (Vertics point : listVertices) {
            str += "(x: " + ((Point_2D) point).getX()
                    + ", y: " + ((Point_2D) point).getY()
                    + "),";
        }
        return str;
    }

    @Override
    public String toString() {
        return "shape type: "
                + this.getClass().getSimpleName()
                + "; Vertex's:"
                + this.getVertices()
                + " Perimeter: "
                + this.getPerimeter()
                + " Area: "
                + this.getArea();
    }
}

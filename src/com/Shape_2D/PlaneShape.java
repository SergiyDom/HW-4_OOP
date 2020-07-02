package com.Shape_2D;


import com.Interfaces.AreaMeasurable;
import com.Interfaces.PerimeterMeasurable;
import com.Point.Point_2D;
import com.Point.Vertics;
import com.Shape;

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

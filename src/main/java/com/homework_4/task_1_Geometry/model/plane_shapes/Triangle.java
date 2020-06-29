package com.homework_4.task_1_Geometry.model.plane_shapes;

import com.homework_4.task_1_Geometry.vertices.Vertices;

public class Triangle extends PlaneShape {
    private Vertices one;
    private Vertices two;
    private Vertices three;

    public Triangle(Vertices one, Vertices two, Vertices three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double perimeter;
    private double area;

    public void init() {
        sideOne = lenghtSide(one, two);
        sideTwo = lenghtSide(one, three);
        sideThree = lenghtSide(two, three);
        perimeter = getPerimeter(sideOne, sideTwo, sideThree);
        area = getArea(lenghtSide(one, two), lenghtSide(one, three), lenghtSide(two, three));
    }

    public void done() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "one = " + one +
                "}, two = " + two +
                "}, three = " + three +
                "}, sideOne = " + sideOne +
                ", sideTwo = " + sideTwo +
                ", sideThree = " + sideThree +
                ", perimeter = " + perimeter +
                ", area = " + area +
                '}';
    }
}

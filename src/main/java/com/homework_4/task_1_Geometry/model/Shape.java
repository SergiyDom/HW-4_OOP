package com.homework_4.task_1_Geometry.model;

import com.homework_4.task_1_Geometry.service.AreaMeasurable;
import com.homework_4.task_1_Geometry.service.LengthSide;
import com.homework_4.task_1_Geometry.service.PerimeterMeasurable;
import com.homework_4.task_1_Geometry.service.VolumeMeasurable;
import com.homework_4.task_1_Geometry.vertices.Vertices;

import static java.lang.Math.PI;

public class Shape implements PerimeterMeasurable, AreaMeasurable, VolumeMeasurable, LengthSide {

    @Override
    public double getArea(double radius) {
        return Math.round(PI * Math.pow(radius, 2) * 100) / 100.0;
    }

    @Override
    public double getArea(double sideOne, double sideTwo, double sideThree) {
        double p = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }

    @Override
    public double getArea(double width, double height) {
        return width * height;
    }

    @Override
    public double getPerimeter(double sideOne, double sideTwo, double sideThree) {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double getPerimeter(double width, double height) {
        return (width + height) * 2.0;
    }

    @Override
    public double getPerimeter(double radius) {
        return Math.round(2 * PI * radius * 100) / 100.0;
    }

    @Override
    public double getVolume(double width, double height, double depth) {
        return width * height * depth;
    }

    @Override
    public double getVolume(double width, double height) {
        return Math.round(1 / 3.0 * Math.pow(width, 2) * height * 100) / 100.0;
    }

    @Override
    public double getVolume(double radius) {
        return Math.round(4 / 3.0 * PI * Math.pow(radius, 3) * 100) / 100.0;
    }

    @Override
    public double lenghtSide(Vertices one, Vertices two) {
        return Math.sqrt(Math.pow(one.x - two.x, 2) + Math.pow(one.y - two.y, 2));
    }
}
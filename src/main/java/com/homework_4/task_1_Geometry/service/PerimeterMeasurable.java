package com.homework_4.task_1_Geometry.service;

public interface PerimeterMeasurable {
    double getPerimeter(double sideOne, double sideTwo, double sideThree);

    double getPerimeter(double width, double height);

    double getPerimeter(double radius);
}
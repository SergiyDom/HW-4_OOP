package com.homework_4.task_1_Geometry.service;

public interface AreaMeasurable {
    double getArea(double radius);

    double getArea(double sideOne, double sideTwo, double sideThree);

    double getArea(double width, double height);
}
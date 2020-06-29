package com.homework_4.task_1_Geometry.service;

public interface VolumeMeasurable {
    double getVolume(double width, double height, double depth);

    double getVolume(double width, double height);

    double getVolume(double radius);
}
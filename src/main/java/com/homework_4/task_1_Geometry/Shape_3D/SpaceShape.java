package com.homework_4.task_1_Geometry.Shape_3D;

import com.homework_4.task_1_Geometry.Interfaces.AreaMeasurable;
import com.homework_4.task_1_Geometry.Interfaces.VolumeMeasurable;
import com.homework_4.task_1_Geometry.Point.Point_3D;
import com.homework_4.task_1_Geometry.Point.Vertics;
import com.homework_4.task_1_Geometry.Shape;

public class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    public void addVertic(Point_3D point) {
        this.listVertices.add(point);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    private String getVertices() {
        String str = "";
        for (Vertics point : listVertices) {
            str += "(x: " + ((Point_3D) point).getX()
                    + ", y: " + ((Point_3D) point).getY()
                    + ", z: " + ((Point_3D) point).getZ()
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
                + " Volume: "
                + this.getVolume()
                + " Area: "
                + this.getArea();
    }
}

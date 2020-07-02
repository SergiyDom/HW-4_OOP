package com.Shape_3D;

import com.Interfaces.AreaMeasurable;
import com.Interfaces.VolumeMeasurable;
import com.Point.Point_3D;
import com.Point.Vertics;
import com.Shape;

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

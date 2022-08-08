package ss6_inheritance.bai_tap.point2d_point3d.model;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), this.z};
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}

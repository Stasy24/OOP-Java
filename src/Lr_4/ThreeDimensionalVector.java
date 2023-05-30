package Lr_4;

public class ThreeDimensionalVector extends Vector {
    private double x;
    private double y;
    private double z;

    public ThreeDimensionalVector(String name, double x, double y, double z) {
        super(name);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double getLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}


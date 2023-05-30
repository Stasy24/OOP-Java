package Lr_4;

public class TwoDimensionalVector extends Vector {
    private double x;
    private double y;

    public TwoDimensionalVector(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public double getLength() {
        return Math.sqrt(x * x + y * y);
    }
}


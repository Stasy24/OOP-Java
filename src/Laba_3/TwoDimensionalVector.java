package Laba_3;

class TwoDimensionalVector extends Vector {
    private double x;
    private double y;

    public TwoDimensionalVector(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    @Override
    public double getLength() {
        return Math.sqrt(x * x + y * y);
    }
}
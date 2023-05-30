package Lr_4;

public abstract class Vector {
    private String name;

    public Vector(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getLength();
}

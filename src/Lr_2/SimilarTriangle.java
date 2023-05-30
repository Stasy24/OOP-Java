package Lr_2;

// Нащадок: Подібний трикутник
public class SimilarTriangle extends Triangle {
    private double n;

    public SimilarTriangle(String name, double a, double b, double c, double n) {
        super(name, a, b, c);
        this.n = n;
    }

    // Збільшення довжин сторін в n раз та периметра трикутника
    public void scale() {
        setA(getA() * n);
        setB(getB() * n);
        setC(getC() * n);
    }

    // Перевизначення методу getPerimeter() для обчислення нового периметра трикутника
    @Override
    public double getPerimeter() {
        return super.getPerimeter() * n;
    }

    // Геттер та сеттер для коефіцієнту подібності
    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }
}

package Lr_2;

// Базовий клас: Трикутник
    public class Triangle {
        private String name;
        private double a, b, c;

        public Triangle(String name, double a, double b, double c) {
            this.name = name;
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getPerimeter() {
            return a + b + c;
        }

        // Геттери та сеттери
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }
    }



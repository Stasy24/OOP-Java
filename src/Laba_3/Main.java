package Laba_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість векторів: ");
        int n = scanner.nextInt();
        Vector[] vectors = new Vector[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введіть координати " + (i + 1) + "-го вектора:");
            System.out.print("x: ");
            double x = scanner.nextDouble();
            System.out.print("y: ");
            double y = scanner.nextDouble();
            System.out.print("z (або 0, якщо це двовимірний вектор): ");
            double z = scanner.nextDouble();

            if (z != 0) {
                vectors[i] = new ThreeDimensionalVector("Вектор " + (i + 1), x, y, z);
            } else {
                vectors[i] = new TwoDimensionalVector("Вектор " + (i + 1), x, y);
            }
        }

        // Find the vector with the largest length
        Vector maxVector = vectors[0];
        for (int i = 1; i < n; i++) {
            if (vectors[i].getLength() > maxVector.getLength()) {
                maxVector = vectors[i];
            }
        }

        System.out.println("Довжини векторів:");
        for (Vector vector : vectors) {
            System.out.println(vector.getName() + ": " + vector.getLength());
        }

        System.out.println("Найбільший вектор: " + maxVector.getName() + " з довжиною " + maxVector.getLength());
    }
}

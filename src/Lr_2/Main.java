package Lr_2;

public class Main {
    public static void main(String[] args) {
        // Створення трикутника
        Triangle triangle = new Triangle("Трикутник", 3, 4, 5);
        System.out.println("Назва: " + triangle.getName());
        System.out.println("Периметр: " + triangle.getPerimeter());

        // Створення подібного трикутника та зміна його розмірів
        SimilarTriangle similarTriangle = new SimilarTriangle("Подібний трикутник", 3, 4, 5, 4.5);
        System.out.println("Назва: " + similarTriangle.getName());
        System.out.println("Коефіцієнт подібності: " + similarTriangle.getN());
        System.out.println("Периметр: " + similarTriangle.getPerimeter());
        similarTriangle.scale();
        System.out.println("Периметр після збільшення розмірів: " + similarTriangle.getPerimeter());
    }
}

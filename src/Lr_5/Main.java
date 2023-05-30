package Lr_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {
            String firstArrString = FileUtils.readFile("input.txt");
            int[] inputArray = Arrays.stream(firstArrString.split(",")).mapToInt(Integer::parseInt).toArray();
            String input = "input.txt";
            String output = "output.txt";
            String content = FileUtils.readFile(input);
            // перетворюємо стрічку на масив цілих чисел
            String[] numbersAsStrings = content.split(",");
            int[] numbers = new int[numbersAsStrings.length];
            for (int i = 0; i < numbersAsStrings.length; i++) {
                numbers[i] = Integer.parseInt(numbersAsStrings[i]);
            }

            // обчислюємо перший ненульовий елемент масиву
            int result = ArrayUtils.determineFirstNonZero(inputArray);

            // записуємо результат у файл
            FileUtils.writeNumberToFile(result, output);

            System.out.println("Результат було успішно записано у файл " + output);

        } catch (IOException e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}





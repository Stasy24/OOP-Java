package Lr_5;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public final class FileUtils {

    private static String path = "C:\\Users\\Animals-Ufo\\IdeaProjects\\untitled\\src\\Lr_5\\";

    public static String readFile(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader((path + filename)));
        String line = br.readLine();
        sb.append(line);
        br.close();
        return sb.toString();
    }

    public static void writeNumberToFile(int number, String filename) {
        try {
            FileWriter writer = new FileWriter((path + filename));
            writer.write(Integer.toString(number));
            writer.close();
        } catch (IOException e) {
            System.err.println("Помилка запису у файл " + filename);
        }
    }


    }


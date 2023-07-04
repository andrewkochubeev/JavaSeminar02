package Homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        System.out.println("Заполните массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        File logFile = new File("log.txt");
        logArray(array, logFile);
        int count = array.length - 1;
        while (count > 0) {
            for (int i = 0; i < count; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
            logArray(array, logFile);
            count--;
        }

    }

    static void logArray(int[] arr, File lf) {

        try (FileWriter fileWriter = new FileWriter(lf, true)) {
            for (int i = 0; i < arr.length; i++) {
                fileWriter.write(arr[i] + " ");
            }
            fileWriter.write("\n");
            fileWriter.flush();
        } catch (IOException ex) {

        }

    }
}

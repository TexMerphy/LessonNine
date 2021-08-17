package ru.geekbrains.lesson.nine;

public class Main {
    String i [][] = {
        {"3", "5", "7", "9"},
        {"2", "4", "6", "8"},
        {"1", "7", "3", "5"},
        {"0", "2", "8", "6"}
    };
    static void arrSize(int lenght){
        if (lenght != 4) {
            String message = String.format("Array must be 4x4!")
            throw new MyArraySizeException(message, e);
        }
    }
    static int sumArr(String[][] nums) {
        arrSize(nums.lenght);
        for (int i = 0; i < val.length; i++) {
            String[] strings = val[i];

        }
    }
}

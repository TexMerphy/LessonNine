package ru.geekbrains.lesson.nine;

public class Main {
    String i [][] = {
        {"3", "5", "7", "9"},
        {"2", "4", "6", "8"},
        {"1", "7", "3", "5"},
        {"0", "2", "8", "6"}
    };

    static void arrSize(String i [][]) {
        if (i.length != 4) {
            throw new MyArraySizeException(message);
        }
    }
    static int sumArr(String[][] nums) {
        arrSize(nums.lenght);
        for (int i = 0; i < val.length; i++) {
            String[] strings = val[i];

        }
    }

    public static void main(String[] args) {
        arrSize();
    }

    public static class MyArraySizeException extends RuntimeException{
        public MyArraySizeException(String message) {
            super(message);
            message = "Array must be 4x4!";
        }
    }
    public class MyArrayDataException extends RuntimeException{
        public MyArrayDataException(String message, Throwable cause) {
            super(message, cause);
            message = "Array must be 4x4!";
        }
    }
}

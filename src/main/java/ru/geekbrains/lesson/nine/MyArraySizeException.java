package ru.geekbrains.lesson.nine;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String message) {
        super(message);
        message = "Array must be 4x4!";
    }
}

package ru.geekbrains.lesson.nine;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
        message = "Array must be 4x4!";
    }
}

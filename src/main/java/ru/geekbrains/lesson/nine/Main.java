package ru.geekbrains.lesson.nine;

public class Main {

    public static void main(String[] args) {

        String[][] i1  = {
                {"3", "5", "7", "9"},
                {"2", "4", "6", "8"},
                {"1", "7", "3", "5"},
                {"0", "2", "8", "6"}
        };
        System.out.println("Сумма элементов массива: " + processArray(i1));

        String[][] i2  = {
                {"3", "5", "7", "9"},
                {"2", "4", "d", "8"},
                {"1", "7", "3", "5"},
                {"0", "2", "8", "6"}
        };
        System.out.println("Сумма элементов массива: " + processArray(i2));

        String[][] i3  = {
                {"3", "5", "7", "9"},
                {"3", "5", "7", "9"},
                {"2", "4", "6", "8"},
                {"1", "7", "3", "5"},
                {"0", "2", "8", "6"}
        };
        try {
            System.out.println("Сумма элементов массива: " + processArray(i3));
        }
        catch (MyArraySizeException ex){
            ex.printStackTrace();
        }
    }

    /**
     * Метод обработки массива
     * @param arr - двумерный массив строк
     * @return - сумма всех элементов массива
     * @throws  - некорректный размер массива
     */
    public static int processArray(String[][] arr) throws MyArraySizeException {

        if (arr.length > 4 || arr[0].length > 4)
            throw new MyArraySizeException("Некорректный размер массива.");

        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                try
                {
                    counter += parseElement(arr[i][j], i, j);
                }
                catch (MyArrayDataException ex){
                    System.out.printf("%s данных по индексу [%d][%d]\n",ex.getMessage(), i, j);
                }
            }
        }
        return  counter;
    }

    /**
     * Вспомогательный метод, преобразование значения элемента к числу
     * @param e - значение элемента массива для анализа
     * @param x - индекс элемента в измерении x
     * @param y - индекс элемента в измерении y
     * @return - результат преобразования строки в число
     * @throws MyArrayDataException
     */
    private static int parseElement(String e, int x, int y) throws MyArrayDataException {
        try
        {
            return Integer.parseInt(e);
        }
        catch (Exception ex){
            throw new MyArrayDataException("Некорректный формат данных");
        }
    }

    /*static void arrSize(String[][] i) {
            if (i.length != 4) {
                    throw new MyArraySizeException();
            }
    }
    static int sumArr(String[][] i) {
            arrSize(i.length);
            for (int i = 0; i < i.length; i++) {


            }
    }*/



    public static class MyArraySizeException extends RuntimeException{
        public MyArraySizeException(String message) {
            super(message);
        }
    }
    public static class MyArrayDataException extends RuntimeException{
        public MyArrayDataException(String message) {
            super(message);

        }
    }
}

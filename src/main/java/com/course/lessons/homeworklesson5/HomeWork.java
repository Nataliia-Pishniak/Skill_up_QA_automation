package com.course.lessons.homeworklesson5;

//- Создать обобщенный класс (Generic) с тремя параметрами (T, V, K).
// Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
// методы возвращающие значения трех переменных.


public class HomeWork {
    public static void main(String[] args) {

        General<String, String, String> case1 = new General <>();
        General<String, Integer, Double> case2 = new General <>();
        General<String, Integer, String> case3 = new General <>();

        String[] people = {"Anna", "Alice", "Alla"};
        Integer[] numbers = {12, 342, 554, 24};
        Double[] numbersDouble = {12.0, 782.0, 0.557, 0.024};

        PrintHW nowWeprint = new PrintHW();
        nowWeprint.printHW(people);
        nowWeprint.printHW(numbers);
        nowWeprint.printHW(numbersDouble);


    }

}

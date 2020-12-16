package com.course.lessons.homeworklesson5;

//Создать класс HeavyBox который содержит переменную private String weight
// Создать динамический массив ArrayList, содержащий 3 объекта класса HeavyBox.
// Изменить вес первого ящика на 1.
// Удалить последний ящик.
// Удалить все ящики.


import java.util.ArrayList;

public class HeavyBoxDisplay {

    public static void main(String[] args) {
        ArrayList<String> HeavyBox = new ArrayList<>();

          HeavyBox.add("4");
          HeavyBox.add("9");
          HeavyBox.add("2");
          HeavyBox.remove(2);

        HeavyBox.set(0,"88");
        HeavyBox.clear();
        System.out.println(HeavyBox.get(0));
        System.out.println(HeavyBox);
    }

}

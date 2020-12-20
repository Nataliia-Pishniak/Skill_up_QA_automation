package com.course.lessons.homeworklesson5;

//Создать класс HeavyBox который содержит переменную private String weight
// Создать динамический массив ArrayList, содержащий 3 объекта класса HeavyBox.
// Изменить вес первого ящика на 1.
// Удалить последний ящик.
// Удалить все ящики.


import java.util.ArrayList;

public class HeavyBoxDisplay {

    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        HeavyBox heavyBox1 = new HeavyBox("3");
        HeavyBox heavyBox2 = new HeavyBox("5");
        HeavyBox heavyBox3 = new HeavyBox("6");

        heavyBoxes.add(heavyBox1);
        heavyBoxes.add(heavyBox2);
        heavyBoxes.add(heavyBox3);
       // heavyBoxes.remove(2);

     //   heavyBoxes.set(0,"88");
        heavyBoxes.get(0).setWeight("1");

        heavyBoxes.clear();
        System.out.println(heavyBoxes.get(0));
        System.out.println(heavyBoxes);
    }

}

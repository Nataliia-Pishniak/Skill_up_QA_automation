package com.course.lessons.homeworklesson5;

//Создать класс Product который содержит переменные private String toyName и private int toyCost
//Создать 3 обьетка класса Product с разными toyName и toyCost
// Создайте HashMap, содержащий пары значений  - Ключ имя игрушки (toyName) и значение стоимость игрушки (toyCost)
//  Вывести в консоль пары значений - entrySet().Перебрать в for each и вывести имена игрушек  - keySet().
//  Перебрать в for each и вывести стоимость игрушeк - values().

public class Product {

    private String toyName;
    private int ToyCost;

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getToyCost() {
        return ToyCost;
    }

    public void setToyCost(int toyCost) {
        ToyCost = toyCost;
    }



    public Product(String toyName, int toyCost) {
        this.toyName = toyName;
        ToyCost = toyCost;
    }




}

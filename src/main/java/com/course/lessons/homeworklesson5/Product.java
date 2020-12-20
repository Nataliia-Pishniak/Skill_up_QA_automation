package com.course.lessons.homeworklesson5;

//Создать класс Product который содержит переменные private String toyName и private int toyCost
//Создать 3 обьетка класса Product с разными toyName и toyCost
// Создайте HashMap, содержащий пары значений  - Ключ имя игрушки (toyName) и значение стоимость игрушки (toyCost)
//  Вывести в консоль пары значений - entrySet().
//  Перебрать в for each и вывести имена игрушек  - keySet().
//  Перебрать в for each и вывести стоимость игрушeк - values().

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public static void main(String[] args) {
        HashMap<Integer, String> toyCostAndToyName = new HashMap<>();

        toyCostAndToyName.put(20, "Doll");
        toyCostAndToyName.put(40, "Bear");
        toyCostAndToyName.put(35, "Wolf");
        toyCostAndToyName.put(12, "Hare");

        System.out.println(toyCostAndToyName);
        System.out.println(toyCostAndToyName.size());

        Set<Integer> keys = toyCostAndToyName.keySet();
        System.out.println("Keys "+ keys );

        ArrayList <String> values = new ArrayList<>(toyCostAndToyName.values());
        System.out.println("Values " + values);

        for (Integer key: toyCostAndToyName.keySet()){
            String name = toyCostAndToyName.get(key);
            System.out.println(key + " uah costs " + name);
        }
    }
}

package com.course.lessons;

public class HomeWorkL4 {

    public static void main(String[] args) {

        //С помощью цикла foreach вывести в консоль цифри больше 0:
        int[] nums = {-1, 2, 0, -5, -7, 6};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.println(nums[i]);}
            }
        //С помощью цикла for со счетчиком вывести в консоль цифри меньше 0:
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                System.out.println(nums[i]);}
        }
        //С помощью цикла for со счетчиком заменить отрицательные числа в масиве на ноль
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                System.out.println(0);}
             else {
                System.out.println(nums[i]);
             }

        //С помощью цикла for со счетчиком вывести в консоль сумму всех цифер
            int sum =0;
            for (i = 0; i < nums.length; i++) {
            sum = sum+nums [i];
            }
            System.out.println("sum: " + sum); }



        }
    }

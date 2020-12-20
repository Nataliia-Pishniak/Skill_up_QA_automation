package com.course.lessons;

import com.course.others.Account;
import com.course.others.Human;
import com.course.others.Printer;

import java.util.ArrayList;
import java.util.HashMap;

public class LessonFive<Intenger> {

    public static void main(String[] args) {
        // key word static

        Human.handCount = 4;

        Human person = new Human("Tom", "John");
        Human person1 = new Human("Tom", "John");
        person.getHandCount();
        person1.getHandCount();

        person.toString();
        person.equals(person1);
        person.hashCode();

//        person.setAge(9);
//        System.out.println();


        System.out.println(person.toString());
        System.out.println(person1.toString());

        System.out.println(person.equals(person1));
        System.out.println(person.hashCode());
        System.out.println(person1.hashCode());


//Generic
        Account <String> acc_here = new Account <>("33");
        Account <Integer> acc_here1 = new Account<>(33);
        Account <Integer> acc_here2 = new Account<>(33);
        System.out.println(acc_here.getId());
        System.out.println(acc_here1.getValue());

        String[] people = {"Tom", "Alice", "Sam"};
        Integer[] numbers = {23, 32, 5674, 234};
        Printer printer = new Printer();
        printer.print(people);
        printer.print(numbers);

        //Collection
        int[] nums = new int[5];
        nums[0] = 5;


        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList.add(5);
  //      arrayList.remove(5);
        arrayList.addAll(arrayList2);

        System.out.println(arrayList.contains(5));
        System.out.println(arrayList.indexOf(5));

        Account<String> acc = new Account<>("33");
        HashMap<String, Account<String>> dictionary = new HashMap<>();

        dictionary.put(acc.getId(), acc);

//        dictionary.put("Value", 33);
//        dictionary.put("Value2", 343);
        Account <String> getMyAcc = dictionary.get("33");
        System.out.println(dictionary.get("Value"));

   }

}

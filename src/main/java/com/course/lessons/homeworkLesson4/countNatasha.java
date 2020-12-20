package com.course.lessons.homeworkLesson4;

public class countNatasha {


    public static int xFactorial (int x) {

        if (x==1) return (return1());

            else
                return x * xFactorial(x-1);
    }
    public static int return1 () {
        return 1;
    }



    public static int ourFactorial( int input) {

        int ourFactorial = 1;

        for (int i = 1; i <= input; i++){
            ourFactorial = ourFactorial*i;
        }
        return ourFactorial;
    }


    public static void main(String[] args) {

        Person [] people = new Person[3];
        people[0] = new Person("Natasha", "Pishnyak", 1);
        people[1] = new Person("Oleg", "Shkurenko", 0);
        people[2] = new Person("Maksym", "Shkurenko", 0);

        int count_natasha = 0;

        for (Person x:people) {
            if(x.getName()=="Natasha") count_natasha++;
        }
                //System.out.println(count_natasha);
        System.out.println(xFactorial(3));

        System.out.println(ourFactorial(5));

    }


}

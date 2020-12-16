package com.course.lessons.homeworkLesson4;

public class Display {

    public static void main(String[] args) {

        Cat cat = new Cat("G", "XY");
        cat.makeNoise();
        cat.eat();

        Dog Zhuk = new Dog("Meat", "Yard");
        Cat Bob = new Cat("Mouse", "House");
        Horse Vitya = new Horse("Oat", "Garden");

        Veterinarian Peter = new Veterinarian();

        Animal[] que = new Animal[3];
        que[0] = Zhuk;
        que[1] = Bob;
        que[2] = Vitya;

        for (Animal patient : que) {
            Peter.treatAnimal(patient);
            System.out.println(patient.getVoice());
        }
    }
}

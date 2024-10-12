package org.example;
import java.util.ArrayList;
import java.util.Scanner;

interface Flying {
    void fly();
}

class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String ageString = age == 1 ? "год" : (age >= 2 && age <= 4 ? "года" : "лет");
        return "Привет! меня зовут " + name + ", мне " + age + " " + ageString + ", я вешу - " + weight + " кг, мой цвет - " + color;
    }
}

class Cat extends Animal {
    public Cat(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("Мяу");
    }
}

class Dog extends Animal {
    public Dog(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("Гав");
    }
}

class Duck extends Animal implements Flying {
    public Duck(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    public void say() {
        System.out.println("Кря");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}

enum Command {
    add, list, exit
}



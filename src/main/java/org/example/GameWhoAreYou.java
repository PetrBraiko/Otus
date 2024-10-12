package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class GameWhoAreYou {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите команду (add/list/exit): ");
            String commandStr = scanner.nextLine().trim().toLowerCase();

            Command command = null;
         try {
               command = Command.valueOf(commandStr);
          } catch (IllegalArgumentException e) {
               System.out.println("Неверная команда. Попробуйте еще раз.");
               continue;
            }

            switch (command) {
                case add:
                    System.out.print("Какое животное вы хотите добавить (cat/dog/duck): ");
                    String animalType = scanner.nextLine().trim().toLowerCase();
                    Animal animal = null;
                    switch (animalType) {
                        case "cat":
                            System.out.print("Введите имя: ");
                            String name = scanner.nextLine().trim();
                            System.out.print("Введите возраст: ");
                            int age = Integer.parseInt(scanner.nextLine().trim());
                            System.out.print("Введите вес: ");
                            double weight = Double.parseDouble(scanner.nextLine().trim());
                            System.out.print("Введите цвет: ");
                            String color = scanner.nextLine().trim();
                            animal = new Cat(name, age, weight, color);
                            break;
                        case "dog":
                            System.out.print("Введите имя: ");
                            name = scanner.nextLine().trim();

                            System.out.print("Введите возраст: ");
                            age = Integer.parseInt(scanner.nextLine().trim());
                            System.out.print("Введите вес: ");
                            weight = Double.parseDouble(scanner.nextLine().trim());
                            System.out.print("Введите цвет: ");
                            color = scanner.nextLine().trim();
                            animal = new Dog(name, age, weight, color);
                            break;
                        case "duck":
                            System.out.print("Введите имя: ");
                            name = scanner.nextLine().trim();
                            System.out.print("Введите возраст: ");
                            age = Integer.parseInt(scanner.nextLine().trim());
                            System.out.print("Введите вес: ");
                            weight = Double.parseDouble(scanner.nextLine().trim());
                            System.out.print("Введите цвет: ");
                            color = scanner.nextLine().trim();
                            animal = new Duck(name, age, weight, color);
                            break;
                        default:
                            System.out.println("Неверный тип животного. Попробуйте еще раз.");
                            continue;
                    }

                    if (animal != null) {
                        animals.add(animal);
                        animal.say();
                    }
                    break;
                case list:
                    if (animals.isEmpty()) {
                        System.out.println("Список животных пуст.");
                    } else {
                        for (Animal a : animals) {
                            System.out.println(a);
                        }
                    }
                    break;
                case exit:
                    System.out.println("До свидания!");
                    scanner.close();
                    return;
            }
        }
    }}
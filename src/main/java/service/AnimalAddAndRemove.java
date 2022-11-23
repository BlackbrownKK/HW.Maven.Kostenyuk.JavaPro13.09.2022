package service;

import model.Animal;

import java.util.Scanner;

public class AnimalAddAndRemove {
    static Scanner sc = new Scanner(System.in);

    public Animal addNewAnimal() {
        return new Animal(chooseKindOfAnimal(), gender(), ageOfAnimal(), idOfAnimal());
    }

    private static String chooseKindOfAnimal() {
        System.out.println("Please, choose operation: 1 to add a dog,  2 to add a cat.");
        String choose = sc.nextLine();
        while (!(choose.equals("0") || choose.equals("1") || choose.equals("2"))) {
            System.out.println("incorrect value. Please, choose operation 0 - exit, 1 to add a dog,  2 to add a cat.");
            choose = sc.nextLine();
        }
        return switch (choose) {
            case "1" -> "dog";
            case "2" -> "cat";
            default -> chooseKindOfAnimal();
        };
    }

    private static String gender() {
        System.out.println("Please, choose operation: 1 to add male,  2 to add female.");
        String choose = sc.nextLine();
        while (!(choose.equals("0") || choose.equals("1") || choose.equals("2"))) {
            System.out.println("incorrect value. Please, choose operation 0 - exit, 1 to add male,  2 to add female.");
            choose = sc.nextLine();
        }
        return switch (choose) {
            case "1" -> "male";
            case "2" -> "female";
            default -> gender();
        };
    }

    private int ageOfAnimal() {
        System.out.println("Please enter the age of animal:");
        int ageOfAnimal;
        ageOfAnimal = sc.nextInt();
        System.out.println(ageOfAnimal);
        return ageOfAnimal;
    }

    private static int idOfAnimal() {
        System.out.println("Please enter the Id of animal:");
        int idOfAnimal = sc.nextInt();
        sc.close();
        return idOfAnimal;
    }
}

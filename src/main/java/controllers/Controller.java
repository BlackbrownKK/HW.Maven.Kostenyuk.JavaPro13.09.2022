package controllers;
import model.Animal;
import service.AnimalAddAndRemove;
import service.AnimalSerializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Controller {

    AnimalAddAndRemove animalAddAndRemove = new AnimalAddAndRemove();

    public void runApp() {
        AnimalSerializer animalSerializer = new AnimalSerializer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, choose operation 0 - exit, 1 to add,  2 to show report, 3 to remove animal.");
        String inputCase = sc.nextLine();
        while (!(inputCase.equals("0") || inputCase.equals("1") || inputCase.equals("2") || inputCase.equals("3"))) {
            System.out.println("incorrect value. Please, choose operation 0 - exit, 1 to add,  2 to show all animals.");
            inputCase = sc.nextLine();
        }
        List<Animal> animals = new ArrayList<>(animalSerializer.deserialize());
        switch (inputCase) {
            case "1" -> {
                animals.add(animalAddAndRemove.addNewAnimal());
                animalSerializer.serialize(animals);
            }
            case "2" -> System.out.println(animalSerializer.deserialize());
            case "3" -> {
                System.out.println("Please select id of animal to remove it");
                int i = sc.nextInt();
                for (Animal animal : animals) {
                    if (animal.getIdAnimal() == i) {
                        animals.remove(animal);
                    }
                    animalSerializer.serialize(animals);
                }
            }
            case "0" -> System.exit(0);
        }
        sc.close();
    }
}

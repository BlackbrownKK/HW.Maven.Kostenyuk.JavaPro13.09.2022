package service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import model.Animal;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class AnimalSerializer {

    private static String pachToTheFile = "src/main/resources/animal.json";

    public void serialize(Animal animal) {

        JsonMapper jsonMapper = new JsonMapper();

        try {
            jsonMapper.writeValue(new File(pachToTheFile), animal);
        } catch (IOException e) {
            System.out.println("cannot create file !");
            e.printStackTrace();
        }
    }

    public void serialize(List<Animal> animals) {
        JsonMapper jsonMapper = new JsonMapper();
        try {
            jsonMapper.writeValue(new File(pachToTheFile), animals);
        } catch (IOException e) {
            System.out.println("cannot create file !");
            e.printStackTrace();
        }
    }

    public Optional<Animal> deserialize() {
        JsonMapper jsonMapper = new JsonMapper();
        try {
            return Optional.of(jsonMapper.readValue(new File(pachToTheFile), Animal.class));
        } catch (IOException e) {
            System.out.println("Cannot read file");
            e.printStackTrace();
            return Optional.empty();
        }
    }
}

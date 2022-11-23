package service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import model.Animal;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
public class AnimalSerializer {
    private final JsonMapper jsonMapper = new JsonMapper();
    private final String path = "src/main/resources/animal.json";

    public void serialize(List<Animal> animals) {

        try {
            jsonMapper.writeValue(new File(path), animals);
        } catch (IOException e) {
            System.out.println("cannot create file !");
        }
    }
    public List<Animal> deserialize() {

        try {
                return List.of(jsonMapper.readValue(new File(path), Animal[].class));
        } catch (IOException e) {
            System.out.println("Cannot read file");
        }
        return Collections.emptyList();
    }
}

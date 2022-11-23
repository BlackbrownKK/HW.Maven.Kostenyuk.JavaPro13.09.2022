
import model.Animal;
import org.junit.Assert;
import org.junit.Test;
import service.AnimalSerializer;

import java.util.ArrayList;
import java.util.List;

public class PetShelterSerializerTest {

    AnimalSerializer animalSerializer = new AnimalSerializer();


    Animal dog = new Animal("csa", "casac", 14, 7385694);
    Animal cat = new Animal("csa", "casac", 14, 47383);
    Animal horse = new Animal("csa", "casac", 14, 54633);

    List<Animal> animals = new ArrayList<>(List.of(dog, cat, horse));

    @Test
    public void serializerListTest() {
        animalSerializer.serialize(animals);
    }

    @Test
    public void deserializeTest() {
        Assert. assertEquals(animals, animalSerializer.deserialize());
    }
}

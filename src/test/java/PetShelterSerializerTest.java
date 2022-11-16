
import model.Animal;
import org.junit.Assert;
import org.junit.Test;
import service.AnimalSerializer;

import java.util.List;
import java.util.Optional;

public class PetShelterSerializerTest {

    AnimalSerializer animalSerializer = new AnimalSerializer();
    private final Animal input = new Animal("dog", "hund", 7, false, "Bob");
    private final Animal input1 = new Animal("cat", "mitiz", 4, true, "Monika");




    @Test
    public void serializerListTest() {
        animalSerializer.serialize(List.of(input, input1));
    }


//    @Test
//    public void deserializeTest() {
//        Optional<Animal> deserialize = animalSerializer.deserialize();
//        Assert.assertEquals(input, deserialize.orElse(null));
//    }
}

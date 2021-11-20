package at.campus02.erfani;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal animal1;
    Animal animal2;
    Animal animal3;

    @BeforeEach
    void setUp() {

       animal1 = new Animal();
       animal1.setName("Hermine");
       animal1.setAge(1);
       animal1.setSpecies("Cat");

       animal2 = new Animal();
       animal2.setName("Tyson");
       animal2.setAge(3);
       animal2.setSpecies("Lion");

       animal3 = new Animal();
       animal3.setName("Johnny");
       animal3.setAge(5);
       animal3.setSpecies("Dog");
    }

    @Test
    void giveAnimalLoud() {
        Assertions.assertEquals("Miau", animal1.giveAnimalLoud() );
        Assertions.assertEquals("Roarrr", animal2.giveAnimalLoud() );
        Assertions.assertEquals("Wuff", animal3.giveAnimalLoud() );
    }

    @Test
    void getNameAge() {
        Assertions.assertEquals ("Name: Hermine Age: 1", animal1.getNameAndage() );
        Assertions.assertEquals("Name: Tyson Age: 3", animal2.getNameAndage() );
        Assertions.assertEquals("Name: Johnny Age: 5", animal3.getNameAndage() );
    }

    @Test
    void ageCategory() {
        Assertions.assertEquals("baby animal", animal1.ageCategory() );
        Assertions.assertEquals("young animal", animal2.ageCategory() );
        Assertions.assertEquals("old animal", animal3.ageCategory() );
    }
}

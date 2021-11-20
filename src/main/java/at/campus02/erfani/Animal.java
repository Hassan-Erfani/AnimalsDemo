package at.campus02.erfani;

public class Animal {
private  String name;
private int age;
private String animalLoud;
private String species;

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

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String giveAnimalLoud() {

        return ( species.equals("Lion") ) ? "Roarrr" :
                    species.equals("Dog") ? "Wuff" :
                        species.equals("Cat") ? "Miau" :
                            "Please give one of this species 'Dog', 'Lion' or 'Cat'";
    }

    public String getNameAndage() {

        return "Name: " + name + " Age: " + age;
    }

    public String ageCategory() {
       return age > 4 ? "old animal" :
                age >= 3 ? "young animal" :
                        age > 0 ? "baby animal" :
                                "Error";
    }
}

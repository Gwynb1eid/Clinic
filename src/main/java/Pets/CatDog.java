package Pets;

public class CatDog implements Pet {
    private final Pet cat;
    private final Pet dog;

    public CatDog(Pet cat, Pet dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void makeSound() {
        this.cat.makeSound();
        this.dog.makeSound();
    }

    public String getName() {
        return String.format("%s%s", this.cat.getName(), this.dog.getName());
    }


}

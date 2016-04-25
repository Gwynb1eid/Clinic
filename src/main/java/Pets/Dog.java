package Pets;

public class Dog implements Pet {

    private final Pet pet;

    public Dog(final Pet pet) {
        this.pet = pet;
    }

    public void makeSound() {
        this.pet.makeSound();
        System.out.println("Gav, Gav");
    }

    //@Override
    public String getName() {
        return this.pet.getName();
    }

}

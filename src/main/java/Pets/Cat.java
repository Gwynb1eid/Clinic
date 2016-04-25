package Pets;

public class Cat extends Animal {

    public Cat(final String name) {
        super(name);
    }

    public void catchMouse() {

    }

    @Override
    public void makeSound() {
        System.out.println(String.format("May %s", this.getName()));
    }



}

public class Animal {
    protected String species;

    public Animal() {
        this.species = "Animal";
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Bird extends Animal {
    public Bird() {
        this.species = "Bird";
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }
}

class Mammal extends Animal {
    public Mammal() {
        this.species = "Mammal";
    }

    @Override
    public void makeSound() {
        System.out.println("Some mammal sound");
    }
}

class Dog extends Mammal {
    public Dog() {
        this.species = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Mammal mammal = new Mammal();

        dog.makeSound();
        bird.makeSound();
        mammal.makeSound();
    }
}

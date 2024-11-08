import Dog.Dog;

public class Zoo {
    public static void main(String[] args){
        Bird bird = new Bird();
        Mammal mammal = new Mammal();
        Dog dog = new Dog();


        bird.makeSound();
        dog.makeSound();
        mammal.makeSound();

    }
}

package lesson_5.limit_types;

public class GenericClass<T extends Mammals & UprightPosture> {

    T animal;

    public GenericClass(T animal) {
        this.animal = animal;
    }

    public void animalSound() {
        animal.makeSound();
    }

    public void run(){
        animal.run();
    }
}

package lesson_5.limit_types;

public class Human extends Mammals implements UprightPosture{

    @Override
    public void run() {
        System.out.println("Я бегу на двух ногах");
    }

    @Override
    protected void makeSound() {
        System.out.println("Я человек");
    }
}

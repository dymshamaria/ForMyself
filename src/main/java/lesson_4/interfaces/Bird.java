package lesson_4.interfaces;

public class Bird implements Flyable, Landing{

    @Override
    public void fly(){
        System.out.println("1. Взмахнуть крыльями");
        System.out.println("2. Подняться в воздух");
    }

    @Override
    public void landing(){
        System.out.println("1. Преземлиться на лапы");
    }
}

package lesson_4.interfaces;

public class Plane implements Flyable, Landing {

    @Override
    public void fly(){
        System.out.println("1. Включить турбины");
        System.out.println("2. Разогнаться до нужной скорости");
        System.out.println("3. Подняться в воздух");
    }

    @Override
    public void landing(){
        System.out.println("1. Сбросить скорость");
        System.out.println("2. Открыть шасси");
        System.out.println("3. Преземлиться");
    }
}

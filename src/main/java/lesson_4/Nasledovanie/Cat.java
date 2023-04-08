package lesson_4.Nasledovanie;

public class Cat extends Mammals{

    String furColor = "black";

    public Cat(String furColor, String name, int age){
        super(furColor);
        this.name = name;
        this.age = age;
    }

    public Cat(String furColor){
        super(furColor);
    }

    String name;
    int age;


    @Override
    public void walk(){
        System.out.println("Кошка идет");
    }

    public void colorFromParent(){
        System.out.println(super.furColor);
    }

    public void walkFromParent(){
        super.walk();
    }

    public void specificMethod(){
        System.out.println("я из класса Cat");
    }
}

package lesson_4.Nasledovanie;

public class Dog extends Mammals{

    public Dog (String furColor){
        super(furColor);

    }

    @Override
    public void walk(){
        System.out.println("Собака идет");
    }
}

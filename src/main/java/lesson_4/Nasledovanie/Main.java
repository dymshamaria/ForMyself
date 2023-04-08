package lesson_4.Nasledovanie;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("brown");
//        System.out.println(cat.isAlive);
//        System.out.println(cat.furColor);
//        cat.walk();
//        cat.colorFromParent();
//        cat.walkFromParent();

//        Mammals cat = new Cat("black");
//        Mammals dog = new Dog("brown");
//        cat.walk();
//        dog.walk();

        SomeClass someClass = new ClassA();
        someClass.method1();
        someClass.fromAbstractClass();
        System.out.println(someClass.a);
    }
}

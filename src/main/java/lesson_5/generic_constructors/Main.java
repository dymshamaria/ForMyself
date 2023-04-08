package lesson_5.generic_constructors;

public class Main {

    public static void main(String[] args) {

        GenericConstructor first = new GenericConstructor(100);
        GenericConstructor second = new GenericConstructor(12.4F);

        first.showValue();
        second.showValue();
    }
}

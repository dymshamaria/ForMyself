package lesson_5.generic_methods;

public class Main {
    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod();
        Integer integers[] = {1,2,3,4,5};
        Double doubles[] = {1.0, 2.0, 3.0, 4.0, 5.0};
        String strings[]= {"один", "два", "три", "четыре", "пять"};

        System.out.println(genericMethod.isIn(1,integers));
        System.out.println(genericMethod.isIn(6.0,doubles));
        System.out.println(genericMethod.isIn("один", strings));
    }
}

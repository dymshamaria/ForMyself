package lesson_3;

public class Main {
    public static void main(String[] args) {

//        MyFirstClass firstClass = new MyFirstClass(3,'e',true, "Hello");
//        System.out.println(firstClass.number);

        try {
            System.out.println(0 / 0);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("я выполнялся в блоке finally");
            }
        }
    }


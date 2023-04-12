package lesson_8.lambdas;

import lesson_8.func_interface.FirstInterface;
import lesson_8.func_interface.SecondInterface;
import lesson_8.func_interface.ThirdInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

//        FirstInterface firstInterface = () -> System.out.println("hello world");
//        firstInterface.simpleMethod();
//
//        SecondInterface secondInterface = () -> 1;
//        System.out.println(secondInterface.simpleMethod());


//        ThirdInterface thirdInterface1 = (string) -> {
//            System.out.println(String.format("В качестве параметра пришла строка '%s'", string));
//            System.out.println(2 + 2);
//            return string.length();
//        };
//
//        System.out.println(thirdInterface1.simpleMethod("hello string"));
//    }


//        Predicate<Integer> predicate = (integer -> integer > 6);
//        System.out.println(predicate.test(5));
//        System.out.println(predicate.test(7));

//        Function<String, Integer> function = (string -> string.length());
//        System.out.println(function.apply("hello world"));

//        Supplier<String> supplier = () -> "hello world";
//        System.out.println(supplier.get());

//        Consumer<Integer> consumer = (integer -> System.out.println(integer));
//        consumer.accept(45);

//        char[] array ={'a','b','c','d','e'};
//        String string = new String(array,1,3);
//        System.out.println(string);

//        String newString = new String(string);
//        System.out.println(newString);

//        byte[] array = {65,66,67};
//        String string = new String(array);
//        System.out.println(string);

//        String string1 = "hello world";
//        String string2 = "hello friend";
//        System.out.println(string1 + string2);

//        System.out.println(string.charAt(1));
//        byte[] array = string.getBytes();
//        for (byte el : array) {
//            System.out.println(el + " ");
//        }

        String string = "  hello world ";
        String string1 = "hello world";
        System.out.println(string.equals(string1));
        System.out.println(string.substring(4));
        System.out.println(string.replace('h', 'w'));
        System.out.println(string.trim());
        System.out.println(string.strip());
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());

        String result = String.join(" ; ", "first", "second", "third");
        System.out.println(result);
    }
}



package lesson_7.bytes;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) throws IOException {

//        int input = System.in.read();
//        System.out.println(input);
//        System.err.println((char)input);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        char c;
//        System.out.println("Введите символы, r - для выхода");
//        do {
//            c = (char) reader.read();
//            System.out.println(c);
//        } while ( c != 'r');


//        int a;
//        a = 'B';
//
//        System.out.write(a);
//        System.out.write('\n');

//        PrintWriter writer = new PrintWriter(System.out, true);
//        writer.println("Это строка");
//        int a = 7;
//        writer.println(a);
//        double d = 3.1e-8;
//        writer.println(d);

//        int input;
//        FileInputStream fileInputStream;

//        try {
//            fileInputStream = new FileInputStream("textFile.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("Данный файл не был найден в системе");
//            return;
//        }
//
//        try {
//            do {
//                input = fileInputStream.read();
//                if (input != -1) {
//                    System.out.println((char) input);
//                }
//            } while (input != -1);
//        } catch (IOException e) {
//            System.out.println("Ошибка чтения из файла");
//        } finally {
//            try {
//                fileInputStream.close();
//            } catch (IOException e) {
//                System.out.println("Ошибка закрытия файла");
//            }
//        }

//        int input;
//
//        try (FileInputStream inputStream = new FileInputStream("textFile.txt");
//             FileOutputStream outputStream = new FileOutputStream("copyToFile.txt")) {
//            do {
//                input = inputStream.read();
//                if (input != -1) {
//                    outputStream.write(input);
//                }
//            } while (input != -1);
//        } catch (IOException e) {
//            System.out.println("Ошибка ввода-вывода");
//        }

        File file = new File("./");
        List<String> list = Arrays.asList(file.list());
        list.spliterator().forEachRemaining(item -> System.out.println(item));
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());


    }
}

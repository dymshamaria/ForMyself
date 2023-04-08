package lesson_6.Sets;

import java.util.*;

public class Example {
    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.addAll(Set.of(7, 5));
//
//        System.out.println(set);
//        System.out.println(set.contains(1));
//        System.out.println(set.containsAll(Set.of(3, 4, 5)));
//        System.out.println(set.isEmpty());
//        set.remove(1);
//        set.removeAll(Set.of(4, 5));
//        System.out.println(set);
//        System.out.println(set.add(7));

//        for (Integer item : set) {
//            System.out.println(item);
//        }

//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next() + 1);
//            iterator.remove();
//        }
//
//        System.out.println(set);

//        Spliterator<Integer> spliterator = set.spliterator();
//        spliterator.forEachRemaining(item -> System.out.println(item - 2));

        Comparator2 comparator2 = new Comparator2();
        Set<User> set = new TreeSet<>(comparator2);
        set.add(new User("Анна", 23));
        set.add(new User("Виктор", 2));
        set.add(new User("Инна", 3443));
        set.add(new User("Николай", 100));
        set.add(new User("Александр", 5));

        System.out.println(set);
    }
}

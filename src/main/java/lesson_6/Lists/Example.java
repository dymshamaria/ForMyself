package lesson_6.Lists;

import java.util.*;

public class Example {
    public static void main(String[] args){
//        List<String> list = new ArrayList<>();
//        list.add("первый элемент");
//        list.add("второй элемент");
//        list.add("третий элемент");
//        System.out.println(list);
//        list.addAll(List.of("четвертый элемент", "пятый элемент"));
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.get(1));
//        list.remove("третий элемент");
//        System.out.println(list.size());
//        System.out.println(list);
//        list.removeAll(List.of("первый элемент", "второй элемент"));
//        System.out.println(list);
//        System.out.println(list.contains("четвертый элемент"));
//        System.out.println(list.containsAll(List.of("четвертый элемент", "пятый элемент")));
//        System.out.println(list.isEmpty());
//        list.clear();
//        System.out.println(list.isEmpty());
//        list.add("первый элемент");
//        list.add("первый элемент");
//        list.add("первый элемент");
//        System.out.println(list);
//        Object[] objArray = list.toArray();
//        String[] srrArray = list.toArray(new String[0]);

//        for (String item : list){
//            System.out.println(item);
//        }

//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        Spliterator<String> spliterator = list.spliterator();
//        while (spliterator.tryAdvance(item -> System.out.println(item + item)));

//        spliterator.forEachRemaining(item -> System.out.println(item.length()));

        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.addFirst("fourth");
        list.addLast("fifth");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);




    }
}

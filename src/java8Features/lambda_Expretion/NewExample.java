package java8Features.lambda_Expretion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//class Example implements Comparator<Integer> {
//    @Override
//    public int compare(Integer i, Integer j) {
//        return (i<j) ? -1 : (i>j) ? 1 : 0;
//
////        if (i<j) {
////            return -1;
////        } else if (i>j) {
////            return 1;
////        } else return 0;
//    }
//}

public class NewExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);

//        System.out.println(list);
//        Collections.sort(list, new Example());
//        System.out.println(list);

        /**
         * TODO : Using Lambda Expretion
         */
        System.out.println(list);
        Comparator<Integer> comparator = (i, j) -> (i<j) ? -1 : (i>j) ? 1 : 0;
        Collections.sort(list, comparator);
        System.out.println(list);

        list.stream().forEach(System.out::println);

        List<Integer> list1 = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(list1);

    }
}
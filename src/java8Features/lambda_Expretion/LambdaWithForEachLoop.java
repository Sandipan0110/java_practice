package java8Features.lambda_Expretion;

import java.util.ArrayList;
import java.util.List;

public class LambdaWithForEachLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aaa");
        list.add("Bbb");
        list.add("Ccc");
        list.add("Ddd");
        list.add("Eee");

        list.forEach(n -> {
            System.out.println(n);
        });

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list1.forEach(x -> {
            System.out.println(x);
        });
    }
}

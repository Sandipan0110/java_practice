package java8Features.lambda_Expretion;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        list.forEach(x -> System.out.println(x));
    }
}

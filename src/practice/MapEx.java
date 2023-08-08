package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapEx {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("1");
        elements.add("2");
        elements.add("5");
        elements.add("11");
        elements.add("7");
        elements.add("9");
        elements.add("1");

        List<String> elements1 = elements.stream().distinct().collect(Collectors.toList());
        Set<String> set = new HashSet<>(elements);
        System.out.println(set);

        System.out.println(elements);
        System.out.println(elements1);
    }

}

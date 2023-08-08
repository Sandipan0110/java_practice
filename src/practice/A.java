package practice;

import java.util.LinkedList;

public class A {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.get(1);
        System.out.println(list);

        list.addFirst(0);
        System.out.println(list);

        list.addLast(6);
        System.out.println(list);

        list.contains(9);
        System.out.println(list);

        list.clear();
        System.out.println(list);

//        list.element();
//        System.out.println(list);

    }
}

package oops.inheritance;

class A {
    int id = 1;
}
class B extends A {
    int id1 = 2;
}

public class Abc {
    public static void main(String[] args) {
        B ab = new B();
        System.out.println("Id is : " + ab.id);
        System.out.println("Id1 is : " + ab.id1);
    }
}
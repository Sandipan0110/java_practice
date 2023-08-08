package oops.polymorphysm;

/**
 * Overloading
 */
class Bag {

    void a() {
        System.out.println("aaaaaaaaaaaa");
    }
    void a(int x) {
        System.out.println("axaxaxaxaxax " + x);
    }
    void a(int x, int y) {
        System.out.println("axyaxyaxyaxy " + x + " " + y);
    }
}
public class Abc {
    public static void main(String[] args) {
        Bag bag = new Bag();
        System.out.println("Method-1");
        bag.a();
        System.out.println("Method-2");
        bag.a(1);
        System.out.println("Method-3");
        bag.a(1,2);
    }
}

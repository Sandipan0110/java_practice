package oops.abstraction;

abstract class Animal {

//    public static void walk() {
//        System.out.println("jjjjjjjj");
//    }

    public abstract void walk();

    public abstract void eat();
}

class Dog extends Animal {

    @Override
    public void walk() {
        System.out.println("aaaaaaaaaaaaaaaaaaaaa");
    }

    @Override
    public void eat() {
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
    }
}

//class Goat extends Dog {
//    @Override
//    public void eat() {
//        System.out.println("Veg");
//    }
//}

public class Abstraction {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.walk();
        animal.eat();

//        Animal.walk();
    }
}

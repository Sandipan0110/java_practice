package oops.polymorphysm;

/**
 * Overriding
 */
class Type {
    void gel() {
        System.out.println("gelpen");
    }
}
class Colour extends Type {
    @Override
    void gel() {
        System.out.println("nnnnnnn");
        super.gel();
        System.out.println("blackColour");
    }
}

public class Pen {
    public static void main(String[] args) {
        Type type = new Colour();
        type.gel();
    }
}

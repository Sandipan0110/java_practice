package practice;

public class SwappingTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c;

        // Using Third Variable
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + " b = " + b);

        // Using Without Third Variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }
}

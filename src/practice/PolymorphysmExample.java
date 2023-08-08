package practice;

class Student {
    void number(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
    void number() {
        System.out.println("Aaaaaaaaaaaaaaa");
    }

    int number(int a, int b, int c) {
        a = b;
        b = c;
        c = a + b;
        System.out.println(c);
        return c;
    }
}

public class PolymorphysmExample {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Hi I'm Sandipan");
        student.number();
        student.number(10, 20);
        student.number(30, 20, 30);
    }
}

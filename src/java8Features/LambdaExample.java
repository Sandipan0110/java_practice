package java8Features;

@FunctionalInterface
interface A {
    /**
     * @TODO : WithOut Parameter
     */
//    public void abc();

    /**
     * @TODO : With Parameter
     */
    public void xyz(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        /**
         * @TODO : WithOut Parameter
         */
//        A a = () -> System.out.println("Hello");
//        a.abc();

        /**
         * @TODO : With Parameter
         */
        A aa = ( a, b) -> System.out.println(a+b);
        aa.xyz(1, 2);

    }
}
package practice;

public class EqualsAndEqualsTo {
    public static void main(String[] args) {
//        String a = "Sandipan";
//        String b = "Sandipan";
//        String c = new String("Sandipan");
//
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(b==c);
//
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(b.equals(c));


        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;

        String s1 = new String("GEEKS");
        String s2 = new String("GEEKS");

        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(s1 == s2);

        System.out.println(t1.equals(t2));
        System.out.println(s1.equals(s2));
    }
}

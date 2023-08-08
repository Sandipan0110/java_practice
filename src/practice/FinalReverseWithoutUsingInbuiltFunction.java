package practice;

public class FinalReverseWithoutUsingInbuiltFunction {
    public static void main(String[] args) {

        // Using For Loop
        String str = "Supratick";
        char chars[] = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();

        // Using String Builder
        String str1 = "Sandipan";
        StringBuilder str2 = new StringBuilder();
        str2.append(str1);
        str2 = str2.reverse();
        System.out.println(str2);

        // Using String Buffer
        String str3 = "Udhay";
        StringBuffer str4 = new StringBuffer();
        str4.append(str3);
        str4= str4.reverse();
        System.out.println(str4);
    }
}
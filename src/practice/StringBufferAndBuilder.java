package practice;

public class StringBufferAndBuilder {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer("Java");
        for (int i = 0; i < 1000; i++) {
            stringBuffer.append("A");
        }
        System.out.println("Buffer taken : " + (System.currentTimeMillis()-startTime));

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Java");
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append("A");
        }
        System.out.println("Buider taken : " + (System.currentTimeMillis()-startTime));
    }
}

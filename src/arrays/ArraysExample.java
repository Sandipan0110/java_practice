package arrays;

import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Arrays No Which you want to enter : ");
        size = scanner.nextInt();

        int a[] = new int[size];
        System.out.println("Enter the Elements : ");
        for (int i = 0; i<size; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("Entered Elements are : ");
        for (int i = 0; i<size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

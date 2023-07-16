//Java Program to Swap Two Numbers using 3rd variable 

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Before Swapping a = " + a + " b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping a = " + a + " b = " + b);

    }
}

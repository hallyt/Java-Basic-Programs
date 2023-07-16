//Java Program to Swap Two Numbers using 3rd variable 

import java.util.Scanner;

public class Swapping2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b ");
        int a = scanner.nextInt();//10
        int b = scanner.nextInt();//2
        System.out.println("Before Swapping a = " + a + " b = " + b);
        a=a+b;//a=12
        b=a-b;//b=10
        a=a-b;//a=2
        System.out.println("After Swapping a = " + a + " b = " + b);

    }
}

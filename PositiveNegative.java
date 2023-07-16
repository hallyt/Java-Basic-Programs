//Java Program to Check Whether a Number is Positive or Negative

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = scanner.nextInt();
        if (n > 0)
            System.out.println(n + " is positive ");
        else
            System.out.println(n + " is negative ");
    }
}

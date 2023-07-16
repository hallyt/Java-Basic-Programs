//Java Program to Perform Arithmetic Operations

import java.util.Scanner;

class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int add = a + b;
        System.out.println("Addition of " + a + " and " + b + " is " + add);
        int sub = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is " + sub);
        int mult = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is " + mult);
        int div = a / b;
        System.out.println("Division of " + a + " and " + b + " is " + div);
   
        int mod = a % b;
        System.out.println("Modulus of " + a + " and " + b + " is " + mod);
   

    }
}
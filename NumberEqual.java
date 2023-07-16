//Java Program to Check if Two Numbers are Equal

import java.util.Scanner;

class NumberEqual
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a==b)
            System.out.println("Both numbers are equal ");
        else 
            System.out.println("both numbers are not equal");
    }
}
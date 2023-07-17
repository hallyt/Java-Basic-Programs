//Java Program to Reverse a Number and Check if it is a Palindrome

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = scanner.nextInt();
        int rev=0,rem,temp=n;
        while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        System.out.println("Original Number  is "+temp);
         System.out.println("Reverse Number  is "+rev);
         if(temp==rev)
            System.out.println(temp+" is palindrome number ");
         else 
            System.out.println(temp+" is not palindrome number ");
    }
}

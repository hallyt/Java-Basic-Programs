//Java Program to Check 3 digit Armstrong Number

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = scanner.nextInt();
        int temp=n;
        int sum = 0, rem,c;
        while (n > 0) {
            rem = n % 10;
            sum=sum + (rem*rem*rem);
            n /= 10;
        }
        if(temp==sum)
            System.out.println(temp+" is amstrong ");
        else 
            System.out.println(temp+" is not armstrong ");
    
    }
}

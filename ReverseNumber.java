//Java Program to Reverse a Number
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = scanner.nextInt();
        int rev=0,rem;
        while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        System.out.println("Reverse Number  is "+rev);
    }
}

//Java Program to Find Sum of Digits of a Number
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = scanner.nextInt();
        int sum=0,rem;
        while(n>0)
        {
            rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println("Sum of digits "+sum);
    }
}

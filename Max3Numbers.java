//Java Program to Find the Largest Number Among Three Numbers using nested if-else 

import java.util.Scanner;

public class Max3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a,b and c ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a>b)
        {
            if(a>c)
                System.out.println("a is largest ");
            else 
                System.out.println("c is largest");
        }
        else 
        {
            if(b>c)
                System.out.println("b is largest ");
            else 
                System.out.println("c is largest ");
        }

    }
}

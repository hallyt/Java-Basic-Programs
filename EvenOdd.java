//Java Program to Check Whether a Given Number is Even or Odd

import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=scanner.nextInt();
        if(n%2==0)
            System.out.println(n+" is even ");
        else 
            System.out.println(n+" is odd ");
            
    }

}
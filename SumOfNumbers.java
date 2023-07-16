//Java Program to Find the Sum of  1 to n numbers  

import java.util.Scanner;

class SumOfNumbers
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of "+n+" numbers is "+sum);
        
    }
}
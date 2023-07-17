import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number ");
        int n=scanner.nextInt();
        int temp=n;
        int f=1;
        while(n>0)
        {
            f*=n;
            n--;
        }
        System.out.println("Factorial of "+temp+" is "+f);

    }
}
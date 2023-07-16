import java.util.Scanner;

public class ArithematicOperationsMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Addition\n" +
                    "2.Subtract\n" +
                    "3.Multiplication\n" +
                    "4.Division\n" +
                    "5.Modulus");
            System.out.println("Enter the value of a and b ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("enter your choice ");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    int add = a + b;
                    System.out.println("Addition of " + a + " and " + b + " is " + add);

                    break;
                case 2:
                    int sub = a - b;
                    System.out.println("Subtraction of " + a + " and " + b + " is " + sub);

                    break;
                case 3:
                    int mult = a * b;
                    System.out.println("Multiplication of " + a + " and " + b + " is " + mult);

                    break;
                case 4:
                    int div = a / b;
                    System.out.println("Division of " + a + " and " + b + " is " + div);

                    break;
                case 5:
                    int mod = a % b;
                    System.out.println("Modulus of " + a + " and " + b + " is " + mod);

                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice ");
                    break;
            }

        }
    }
}

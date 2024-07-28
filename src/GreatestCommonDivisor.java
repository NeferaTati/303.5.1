import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[]args) {
        Scanner scanner = new
                Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        int num2 = scanner.nextInt();
        scanner.close();
        GCD(num1, num2);

    }

    static void GCD(int a, int b){
        int temp = 0;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.printf("The GCD of  of %d and %d  is %d", a,b,temp);
    }
}
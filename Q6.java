import java.util.Scanner;

public class Q6{
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of base: ");
        int base = sc.nextInt();

        System.out.println("Enter the value of exponent: ");
        int exponent = sc.nextInt();

        double result = Math.pow(base,exponent);    // formula

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
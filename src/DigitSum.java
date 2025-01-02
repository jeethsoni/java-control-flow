import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitSum {
    public static int sumOfDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number != 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10; // Remove the last digit
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        // Try and catch to catch decimal input
        try {
            // user input
            int number = sc.nextInt();

            // Sum of digits
            int sum = DigitSum.sumOfDigits(number);
            System.out.println("Sum of all digits is: " + sum);
        }catch (InputMismatchException e){
            System.out.println("Sorry Only whole numbers are allowed");
        }
    }
}

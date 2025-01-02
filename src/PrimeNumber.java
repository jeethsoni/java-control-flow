import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrimeNumber(int number) {

        // number less than 2, return false
        if (number < 2) {
            return false;
        }

        // Checks if a number is print or not
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Printing if a number is prime or not
        boolean isPrime = PrimeNumber.isPrimeNumber(number);
        if (isPrime) {
            System.out.println("It's a prime number");
        } else {
            System.out.println("It's not a prime number");
        }
    }
}

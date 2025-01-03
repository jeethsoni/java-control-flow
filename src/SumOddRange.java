import java.util.Scanner;

public class SumOddRange {
    public static boolean isOdd(int number) {

        // checks for negative number
        if (number < 0) {
            return false;
        }
        return number % 2 != 0; // return true if number is odd
    }

    public static int sumOdd(int start, int end) {

        // Check if end is less than start or if start or end is negative
        if (end <= start || (start < 0 || end < 0)) {
            return -1;
        }

        int sum = 0;

        for (int i = start; i < end; i++) {
            // if number is odd, add to sum
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum; // return final sum
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();

        // Sum of all odd numbers
        int sumOfOdd = SumOddRange.sumOdd(first, second);
        System.out.println("Sum of all odd numbers between the range provided = " + sumOfOdd);
    }
}

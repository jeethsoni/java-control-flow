import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        // Checks for single digit number
        if (first < 10 || second < 10) {
            return -1;
        }

        // formula to find the greatest common divisor
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }

        return first; // returns the divisor

    }

    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner (System.in);

        // Takes start and end range input from user
        System.out.println("Enter the starting range of the number: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending range of the number: ");
        int end = sc.nextInt();

        // prints the greatest common divisor
        int greatestDivisor = GreatestCommonDivisor.getGreatestCommonDivisor(start, end);
        System.out.println("The greatest common divisor between the range provided: " + greatestDivisor);

    }
}

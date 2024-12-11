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
}

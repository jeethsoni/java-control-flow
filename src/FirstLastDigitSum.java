public class FirstLastDigitSum {
    public static int sumFirstLast(int number) {

        // Checks if the number is negative
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;  // extracts last digit
        while (number >= 10) {
            number = number / 10; // Divides number by 10
        }

        int firstDigit = number; // set first digit to last number left
        return lastDigit + firstDigit; // addition of numbers
    }

    public static void main(String[] args) {


        // Sum of first and last digit
        int lastFirstSum = FirstLastDigitSum.sumFirstLast(5);
        System.out.println("Sum of first and last digit of the number provided is " + lastFirstSum);
    }
}

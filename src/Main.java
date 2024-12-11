public class Main {
    public static void main(String[] args) {

        // Prints how many days are in a month
        int numOfDays = NumberOfDaysInMonth.getDaysInMonth(2, 2019);
        System.out.println("Number of Days = " + numOfDays);

        // Printing if a number is prime or not
        boolean isPrime = PrimeNumber.isPrimeNumber(2);
        if (isPrime){
            System.out.println("It's a prime number");
        }else {
            System.out.println("It's not a prime number");
        }

        // Sum of all odd numbers
        int sumOfOdd = SumOddRange.sumOdd(1, 100);
        System.out.println("Sum of all odd numbers between the range provided = " + sumOfOdd);

        // Sum of digits
        int sum = DigitSum.sumOfDigits(125);
        System.out.println(sum);

        // number palindrome
        boolean isPalindrome = NumberPalindrome.isPalindrome(708);
        if (isPalindrome){
            System.out.println("The number provided is a Palindrome");
        }else {
            System.out.println("The number provided is not a palindrome");
        }
    }

}
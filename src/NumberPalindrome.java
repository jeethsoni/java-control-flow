import java.util.Scanner;

public class NumberPalindrome {
    public static boolean isPalindrome(int original) {

        // initializing variables
        int reverse = 0;
        int temp = original;

        // while loop
        while (temp != 0) {
            // logic to check the reverse of the original number
            reverse = reverse * 10 + temp % 10;
            temp /= 10;

        }
        return reverse == original;

    }

    public static void main(String[] args) {

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Takes input from the user
        System.out.println("Enter a number: ");
        int number  = scanner.nextInt();

        //checks if number is palindrome or not
        boolean isPalindrome = NumberPalindrome.isPalindrome(number);
        if (isPalindrome) {
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
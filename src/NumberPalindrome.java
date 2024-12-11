public class NumberPalindrome {
    public static boolean isPalindrome(int original){

        // initializing variables
        int reverse = 0;
        int temp = original;

        // while loop
        while(temp != 0){
            // logic to check the reverse of the original number
            reverse = reverse * 10 + temp % 10;
            temp /= 10;

        }
        return reverse == original;

    }
}

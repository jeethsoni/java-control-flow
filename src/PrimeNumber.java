public class PrimeNumber {
    public static boolean isPrimeNumber(int number) {

        // number less than 2, return false
        if(number < 2){
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
}

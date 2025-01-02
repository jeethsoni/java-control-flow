public class LargestPrime {
        public static int getLargestPrime(int number) {

            // Checks if number is less than 2
            if (number < 2) {
                return -1;
            }

            int largestPrime = 0;

            // finds the factor of number and checks for the largest prime
            for (int i = 2; i <= number; i++) {
                boolean isPrime = PrimeNumber.isPrimeNumber(i);  // prime number checker method

                // checks for largest prime
                if (number % i == 0 && isPrime) {
                    largestPrime = i;
                }
            }
            return largestPrime;
        }
    public static void main(String[] args) {
        // Largest Prime factor
        int largestPrime = LargestPrime.getLargestPrime(21);
        System.out.println(largestPrime);
    }
}

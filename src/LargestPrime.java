public class LargestPrime {
        public static int getLargestPrime(int number) {
            if (number < 2) {
                return -1;
            }

            int largestPrime = 0;

            for (int i = 2; i <= number; i++) {
                boolean isPrime = PrimeNumber.isPrimeNumber(i);

                if (number % i == 0 && isPrime) {
                    largestPrime = i;
                }
            }
            return largestPrime;
        }


}

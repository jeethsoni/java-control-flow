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


    }

}
public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        // Checks for single digit number
        if (first < 10 || second < 10){
            return -1;
        }

        // formula to find the greatest common divisor
        while (second != 0){
            int temp = second;
            second = first % second;
            first = temp;
        }

        return first; // returns the divisor

    }
}

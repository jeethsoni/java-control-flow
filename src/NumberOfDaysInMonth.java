import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;  // return false if year is negative
        }

        // Nested If statements
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;

    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                boolean isLeap = isLeapYear(year);
                if (isLeap) {
                    yield 29;
                }
                yield 28;
            }
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };

    }


    public static void main(String[] args) {

        // Takes input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        System.out.println("Enter Year: ");
        int year = scanner.nextInt();

        // Prints how many days are in a month
        int numOfDays = getDaysInMonth(month, year);
        System.out.println("Number of Days = " + numOfDays);

    }
}
# java-control-flow
**Author: Jeet Soni**

**Date: 12/07/2024**

## :memo: Description

Here is yet another java assignment I worked on. This time its java control flow where I learned about loops, break, continue
and switch statement. I applied what I learned to create short programs.

:pushpin: Note: No AI assistance was used to solve any of the exercises :smile:

## :bulb: Problems I tackled

### 1) Write a method named sumOfDigits in the DigitSum class that takes an integer as input and returns the sum of its digits.If the input is negative, the method should return -1. 

First, I created `if` statement that checks for negative number. 
I used a while loop to keep extracting the last digit and adding it to the `sum` variable. Then, I divided the number 
by 10 to get rid of last digit. The final result gave me the sum of all digits.

### 2) Write a small program that checks if a number is a palindrome.

firstly, I checked if the number is negative or not. Then, I stored my original number in a `temp` variable.
I used while loop to keep extracting the digits of the number and then constructed the reverse by multiplying the current
reverse by `10` and adding the extracted digit. Then, I divided the `temp` by `10` to remove the last digit. Finally, I 
compared the original number with the reverse.

### 3) Write a small program that calculates the sum of the first and last digits of a given number.

First, I check for negative number using `if` statement. The last digit is extracted using the modulus operator (`% 10`), 
while the first digit is determined by repeatedly dividing the number by `10` until only one digit remains. The method then 
adds the first and last digits and returns the result.

### 4) Write a small program that returns the greatest common divisor of two numbers.

I created a method `getGreatestCommonDivisor`, to calculate the greatest common divisor (GCD) of two integers using the Euclidean algorithm. If either number is less than 10, the method returns `-1`. The GCD is determined by repeatedly finding the remainder until it reaches zero, with the last non-zero value being the result.

### 5) Write a small program that sums up the odd numbers in a given range.

This class provides two methods: `isOdd` checks if a number is odd, returning `true` for positive odd numbers. `sumOdd` calculates the sum of all odd numbers in a given range. If the range is invalid (negative values or `end <= start`), it returns `-1`. Otherwise, it sums the odd numbers within the range using `isOdd`.

### 6) Write a small program that checks if a number is a prime number or not a prime number.

As we know, 0 and 1 are not prime numbers. I check for it in the beginning of the program. Then, I used a `for` loop 
to iterate over all number starting from `2` till half of the given number. I did this to cut down the computation time of
the algorithm. This will make the program faster if the number is large. To check for prime, I used modulus `(number % i)`. 
If the remainder is 0, then the number is not prime. 

### 7) Write a small program that determines the number of days in a particular month.

The `NumberOfDaysInMonth` class provides two methods: `isLeapYear` and `getDaysInMonth`. The `isLeapYear` method checks whether a given year is a leap year, returning `true` for leap years and `false` for non-leap years. It uses a series of nested `if` statements to determine this based on divisibility rules for 4, 100, and 400. The `getDaysInMonth` method returns the number of days in a specified month and year, taking into account leap years for February. It uses a `switch` statement to return the correct number of days for each month, and `-1` for invalid month or year inputs.

### 8) write a small program that can determine the largest prime factor of a given number.

First, it checks if the number is less than 2, returning `-1` for invalid input. The method then iterates through all possible factors, using the `isPrimeNumber` method from the `PrimeNumber` class to identify prime factors. The largest prime factor is tracked and returned as the result.

## :thinking: What did I learn? 

I learned about so much about for loop, while loop, switch statements, If, else if and else statements. 
This concept was not difficult for me to grasp because I have already learned these topics while I was learning python.

These exercises were really fun . Can't wait to dive into OOP next :smile:	

Made with :heart: by Jeet Soni



















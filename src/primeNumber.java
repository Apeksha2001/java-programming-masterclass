import java.util.Scanner;

public class primeNumber {

    public static void main(String args[]) {
        //check whether number is prime or not by using method isPrime
        System.out.println("17" + " is " + (isPrime(17) ? " " : "NOT ") + "prime number");

        //check count of prime number between existing range
        int counter = 0;
        for (int i = 1; i <= 10; i++) {
            if (isPrime((i))) {
                System.out.println(i + " is prime number");
                counter++;
            }
        }
        System.out.println("Prime number between 1 and 10 is: " + counter);

    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber == 0 || wholeNumber == 1) {
            return false;
        }
        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}


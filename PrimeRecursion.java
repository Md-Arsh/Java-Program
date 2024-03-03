public class PrimeRecursion {

    // Recursive method to check if a number is prime
    static boolean isPrime(int n, int divisor) {
        // Base cases
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (divisor == 1) {
            return true;  // If divisor reaches 1, the number is prime
        }

        // If n is divisible by the current divisor, it's not prime
        if (n % divisor == 0) {
            return false;
        }

        // Recursive call with the next divisor
        return isPrime(n, divisor - 1);
    }

    public static void main(String[] args) {
        // Example: checking if 7 is a prime number
        int numberToCheck = 7;

        // Start checking for primality from (number - 1)
        boolean result = isPrime(numberToCheck, numberToCheck - 1);

        if (result) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }
    }
}

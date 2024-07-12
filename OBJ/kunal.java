import com.src.Src;

public class kunal {

    // Method to convert decimal to binary
    static void decimalToBinary() {
        int p = 0;
        int resNum = 0;
        int rem = 0;
        int num = 4;
        while (num != 0) {
            rem = num % 2;
            num /= 2;
            resNum += rem * Math.pow(10, p);
            p++;
        }
        System.out.println(resNum);
    }

    // Method to convert binary to decimal
    static void binaryToDecimal() {
        int p = 0;
        int resbinaryNum = 0;
        int rem = 0;
        int binaryNum = 1111100011;
        while (binaryNum != 0) {
            rem = binaryNum % 10;
            binaryNum /= 10;
            resbinaryNum += rem * Math.pow(2, p);
            p++;
        }
        System.out.println(resbinaryNum);
    }

    // Method to reverse a number
    static void reverseNumber(int num) {
        int rem = 0;
        int newnum = 0;
        while (num > 0) {
            rem = num % 10;
            num /= 10;
            newnum = newnum * 10 + rem;
        }
        System.err.println(newnum);
    }

    // Method to count the number of digits in a number
    static void countNumber(int num) {
        System.out.println((int) (Math.log(num) / Math.log(10)) + 1);
    }

    // Method to check if a number is an Armstrong number
    static void Armstrong() {
        int copy = 153;
        int num = copy;
        int rem = 0;
        int res = 0;
        while (num != 0) {
            rem = num % 10;
            res = res + (int) Math.pow(rem, 3);
            num /= 10;
        }
        System.out.println(res == copy);
    }

    // Method to check if a number is a palindrome
    static void palindrome() {
        int num = 121;
        int copy = num;
        int res = 0;
        while (num != 0) {
            int rem = num % 10;
            res = res * 10 + rem;
            num /= 10;
        }
        String resp = (copy == res) ? "Palindrome" : "Not Palindrome";
        System.out.println(resp);
    }

    // Method to print all divisors of a number
    static void divisor(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " is a divisor of " + num);
            }
        }
    }

    // Method to check if a number is prime
    static void isPrime(int num) {
        boolean isPrime = true;
        if (num < 2) {
            System.err.println("Not Prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime) {
            System.out.println(num + " is not prime");
        } else {
            System.out.println(num + " is prime");
        }
    }

    // Method to print the first n prime numbers
    public static void printNPrimes(int n) {
        int count = 0; // Counter for the number of primes found
        int num = 2;   // The first prime number

        while (count < n) {
            if (isPrime1(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    // Helper method to check if a number is prime (used by printNPrimes)
    public static boolean isPrime1(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;S
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        // Example usages of various methods
        decimalToBinary();
        binaryToDecimal();
        reverseNumber(12345);
        countNumber(1234567890);
        Armstrong();
        palindrome();
        divisor(36);
        isPrime(100);
        printNPrimes(10);
    }
}

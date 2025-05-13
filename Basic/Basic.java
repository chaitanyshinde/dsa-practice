import java.util.*;

public class Basic {

    // 1. Reverse No :
    public static int reverseNUmber(int n) {
        int ans = 0;
        while (n > 0) {
            int latDigit = n % 10;
            ans = ans * 10 + latDigit;
            n /= 10;
        }
        return ans;
    }

    // 2. missing No :
    public static int missingNo(int arr[]) {
        int n = arr.length + 1;
        int actual = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return actual - sum;
    }

    // 3. fibo Series :
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    // 4. prime No:
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 5. factorial :
    public static int fact(int n) {
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor = factor * i;
        }
        return factor;
    }

    // 6. palindrome no :
    public static boolean palindrome(int n) {
        if (reverseNUmber(n) == n) {
            return true;
        }
        return false;
    }

    // 7. No of digits in no:
    public static int noOfDigits(int n) {
        int counter = 0;
        if (n == 0) {
            counter = 1;
        }
        while (n != 0) {
            n = n / 10;
            counter++;
        }
        return counter;
    }
    // or
    public static int count(int n) {
        return (n == 0) ? 1 : (int) Math.log10(Math.abs(n)) + 1;
    }

    // 9. All prime factors:
    // if n%i and i is prime then -> print

    // 10. leap year:
    // if((year%4==0&&year%100!=0)||(year%400==0)) {
    // System.out.println(year + " is a Leap Year."); }

    // 11. swap without using third variable:
    // a=a+b;
    // b=a-b;
    // a=a-b;

    // 12. Sum of A.P. formula:
    // int sum = (n*(2*a+(n-1)*d)) / 2;

    // 13. first inc then dec array:(123654)
    // sort array -> print half arr -> then print half from end in reverse

    public static void main(String[] args) {
        System.out.print(count(123));

    }
}

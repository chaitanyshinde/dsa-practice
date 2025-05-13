import java.util.*;

public class ArrayTest {

    // 1. Max Subarray Sum :
    public static int maxSubArraySum(int[] arr) {
        int max_Sum = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max_Sum) {
                max_Sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max_Sum;
    }

    // 2.largest subarray with equal number of Os & 1s(addition=0)
    public static int maxLength(int arr[]) {
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sum += -1;
            } else {
                sum += arr[i];
            }
            if (sum == 0) {
                maxLen = i + 1;
            }
        }
        return maxLen;
    }

    // 3. 2nd Largest:
    public static int secLargest(int[] arr) {
        int lar = 0;
        int secLar = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
                secLar = lar;
                lar = arr[i];
            }
        }
        return secLar;
    }

    // 4. Remove Duplicates from sorted array:
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1)
            return n;
        int index = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }
        return index; // run loop from 0 to index & print arr
    }

    // 5. Greater element than prv elements
    public static int countGreaterElements(int[] arr, int n) {
        int count = 1; // First element is always counted
        int maxSoFar = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxSoFar) {
                count++;
                maxSoFar = arr[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // int[]arr = {1,2,3,4};

        // array input:
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

    }
}

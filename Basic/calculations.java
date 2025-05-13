import java.util.*;

public class calculations {

    // card pyramid :
    public static int pyramid(int n) {
        if (n == 1) {
            return 2;
        }
        return (n * 2) + (n - 1) + pyramid(n - 1);
    }

    // n vertical pieces :
    public static int birthday(int n) {
        if (n == 0) {
            return 1;
        }
        int ans = 0;
        int parts = n + birthday((n - 1));
        ans += parts;
        // OR : ans = sum of n natural numbers + 1
        return ans % 1000000007;
    }

    // min possible from set bits of N :
    public static int rearrangeBits(int N) {
        int countOfSetBits = Integer.bitCount(N); // count setBits
        int result = (1 << countOfSetBits) - 1; // min no
        return result;
    }

    // no -> binary -> 0->1, 1->2 :
    public static int isMagical(int num) {
        String binary = Integer.toBinaryString(num); // Convert to binary
        int sum = 0;

        for (char c : binary.toCharArray()) {
            if (c == '0') {
                sum += 1; // Replace '0' with 1
            } else {
                sum += 2; // Replace '1' with 2
            }
        }

        return sum;
    }

    // TCS Q.5:
    public static int maximumGust(int N, int[] E, int[] L) {
        int currGust = 0;
        int maxGust = 0;
        for (int i = 1; i <= N; i++) {
            currGust += E[i];
            currGust -= L[i];
            maxGust = Math.max(maxGust, currGust);
        }
        return maxGust;
    }

    public static void main(String[] args) {
    }
}

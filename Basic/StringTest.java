import java.util.*;

public class StringTest {

    // 1. return 11 % string:
    public static int reminder(String s) {
        int rem = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = rem * 10 + (s.charAt(i) - '0');
            rem = num % 11;
        }
        return rem;
    }

    // 2. imp : freq of each char in new freq with char :
    public static String practice(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (Character i : map.keySet()) {
            sb.append(i).append(map.get(i));
        }
        return sb.toString();
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    // 3. permutations of consonants : factorial
    public static int count(String s) {
        if (s.length() == 0)
            return 0;
        HashMap<Character, Boolean> map = new HashMap<>();
        map.put('A', true);
        map.put('E', true);
        map.put('I', true);
        map.put('O', true);
        map.put('U', true);
        map.put('a', true);
        map.put('e', true);
        map.put('i', true);
        map.put('o', true);
        map.put('u', true);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)))
                count++;
        }
        if (count == 0)
            return 0;

        return fact(count);
    }

    // 4. 1->A, 11->B, split at 0 :
    public static String alpha(String s) {
        String[] sequences = s.split("0");
        StringBuilder sb = new StringBuilder();
        for (String i : sequences) {
            if (!i.isEmpty()) {
                int count = i.length();
                char ans = (char) (64 + count);
                sb.append(ans);
            }
        }
        return sb.toString();
    }

    // 5. length of last word of string :
    public static int length(String s) {
        s.trim();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count = 0;
            } else {
                count++;
            }
        }
        return count;
    }

    // 6. characters with frequency :
    public static String repeat(int n, String str) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 1; i < str.length(); i += 2) {
            sum += str.charAt(i) - '0';
            if (sum >= n) {
                sb.append(str.charAt(i - 1));
                return sb.toString();
            }
        }
        return "-1";
    }

    // 7. isPalindrome
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    // 8. color stone : (13-sep part1)
    public static int colorStonePosn(String s, String t) {
        int idx = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(idx)) {
                idx++;
            }
        }
        return idx + 1;
    }

    // 9. valid password :
    public static int validPass(String s) {
        int n = s.length() - 1;
        if (n < 0) {
            return 0;
        }
        if (s.charAt(0) - '0' >= 0 && s.charAt(0) - '0' <= 9) {
            return 0;
        }
        if (n < 3) {
            return 0;
        }
        int count = 0;
        int num = 0;
        for (int i = 0; i <= n; i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '/') {
                return 0;
            }
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                count++;
            }
            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                num++;
            }
        }
        if (count < 1 && num < 1) {
            return 0;
        }
        return 1;
    }

    // 10. calculate 1A2B3C as A=&, b=|, C=^ :
    public static int calcBinary(String s) {
        int ans = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i += 2) {
            if (s.charAt(i) == 'A') {
                ans &= s.charAt(i + 1) - '0';
            } else if (s.charAt(i) == 'B') {
                ans |= s.charAt(i + 1) - '0';
            } else {
                ans ^= s.charAt(i + 1) - '0';
            }
        }
        return ans;
    }

    // 11. Anagram or not :
    public static boolean anagrams(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        s.toLowerCase(); // to lower case both
        t.toLowerCase();

        char[] ss = s.toCharArray(); // convert to array
        char[] tt = t.toCharArray();

        Arrays.sort(ss); // sort array
        Arrays.sort(tt);

        return Arrays.equals(ss, tt);

    }

    // Print EVEN ODD string :
    public static String sequence(int arr[]) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sb.append("Even");
            } else {
                sb.append("Odd");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    }
}
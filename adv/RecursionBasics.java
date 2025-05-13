public class RecursionBasics {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;

    }

    // Fibonacci Numbers :
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    // Power :
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    // Tiling Problem :
    public static int tilingProblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int fnm1 = tilingProblem(n - 1);
        // horizontal choice
        int fnm2 = tilingProblem(n - 2);
        int totWays = fnm1 + fnm2;
        return totWays;

        // return tilingProblem(n-1) + tilingProblem(n-2);
    }

    // Remove Duplicates :
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    // Friends Pairing :
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    // Binary String Problem :
    public static void printBinStrings(int n, int LP, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinStrings(n - 1, 0, str + "0");
        if (LP == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }

    // First Occurrence
    public static int first_occ(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first_occ(arr,key,i+1);
    }
    public static void main(String arg[]) {
        int arr[] = {2,3,4,5,6,7};
        System.out.println(first_occ(arr,5,0));
    }
}

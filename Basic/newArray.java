import java.util.*;

public class newArray {
    // 2nd Largest no:
    public static int secondLargest(int[] arr, int n) {
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }

    // Remove duplicates: and return length
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0)
            return 0;
        int i = 0; // Pointer for unique elements
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j]; // Move unique element forward
            }
        }
        return i + 1; // Return the count of unique elements
    }

    // left shift:
    public static void leftShift(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    // zeros to end:
    public static void zeroToEnd(int[] arr) {
        int i = 0;
        int n = arr.length - 1;
        while (i <= n) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
                n--;
            } else {
                i++;
            }
        }
    }

    // Missing no in array:
    public static int missingNo(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum; // Missing number is the difference
    }

    // Union of arrays: Brute :
    public static int[] union(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr1)
            set.add(i);
        for (int j : arr2)
            set.add(j);
        int i = 0;
        int[] union = new int[set.size()];
        for (int num : set) {
            union[i++] = num;
        }
        return union;
    }

    // TCS Q.4 : merge two arr and return nums1 sorted:
    public static void mergeArr(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0 && index < n) {
                nums1[i] = nums2[index++];
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    //TCS NQT NO.1: 
    // Scanner sc = new Scanner(System.in);
    // String str = sc.nextLine();sc.close();
    // int starCount = 0;
    // int hashCount = 0;for(
    // char ch:str.toCharArray()){
    //     if (ch == '*') starCount++;
    //     if (ch == '#') hashCount++;
    // }if(starCount==hashCount){
    //     System.out.print(0);
    // }else{
    //     System.out.print(starCount - hashCount);
    // }

    public static void main(String[] args) {

        // System.out.println(Arrays.toString(union(arr1, arr2)));
    }
}

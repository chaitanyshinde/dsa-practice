import java.util.*;

public class newString {
    // 1. duplicate words in a given string:
    // String str = "big bag dog big bag";
    // int count;
    // str.toLowerCase();
    // String[] words = str.split(" ");
    // for(int i = 0;i<words.length;i++){
    // count = 1;
    // for (int j = i + 1; j < words.length; j++) {
    // if (words[i].equals(words[j])) {
    // count++;
    // words[j] = "0";
    // }
    // }
    // if (count > 1 && words[i] != "0") System.out.println(words[i]);
    // }

    // 2. TCS PYQ pdf Q.3:
    // Scanner sc = new Scanner(System.in);
    // int N = sc.nextInt();
    // sc.nextLine(); //for new line
    // String [] words = new String[N];
    // for(int i=0; i<N; i++){
    // words[i] = sc.nextLine().trim();
    // }
    // HashMap<String, Integer> map = new HashMap<>();
    // for(String i : words){
    // map.put(i, map.getOrDefault(i,0)+1);
    // }
    // for(String i : map.keySet()){
    // if(map.get(i)%2 == 1){
    // System.out.println(i + " is present odd no of times");
    // sc.close();
    // return;
    // }
    // }
    // System.out.println("All are even");
    // sc.close();

    // TCS NQT Q.NO 3:
    public static String balloon(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (String j : map.keySet()) {
            if (map.get(j) % 2 == 1) {
                return j;
            }
        }
        return "ALL ARE EVEN";
    }

    public static void main(String[] args) {
        
    }
}

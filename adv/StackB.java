import java.util.*;

public class StackB { 
//push at bottom :
    public static void pushAtBottom(Stack<Integer> s, int data){
       if(s.isEmpty()){
        s.push(data);
        return;
       }
       int top = s.pop();
       pushAtBottom(s,data);
       s.push(top);
    }
//Reverse string using stack :
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
///Reverse stack :
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
//stocks span : 
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
//Duplicate parentheses : 
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //closing
            if(ch==')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
// Max array in histogram
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        s = new Stack<>();
        for(int i=0; i<=arr.length-1; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        for(int i=0; i<=arr.length-1; i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height * width;
            maxArea = Math.max(currArea,maxArea);
        }
        System.out.println("Max area of rect in histogram = " + maxArea);
    }
    public static void main(String args[]){
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(4);
        // while(!s.isEmpty()){
        //   System.out.println(s.peek());
        //   s.pop();
        // }

        //2:
        String str = "abc";
        System.out.println(reverseString(str));        
    }
}

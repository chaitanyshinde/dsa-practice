public class searchingSorting {
    // Binary Search :
    public static int binary(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target == arr[mid] ){
                return mid;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    // Selection Sort :
    public static void selection(int[]arr){
        for(int i=0; i<=arr.length-2; i++){
            int minPos = i;
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    // Bubble Sort:
    public static void bubble(int[]arr){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Insertion Sort:

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        bubble(arr);
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }

    }
}

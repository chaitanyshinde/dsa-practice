import java.util.*;

public class Practice { 

 

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String [] arr = new String[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextLine();
    }
    

    sc.close();
  }
}

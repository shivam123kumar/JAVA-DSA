import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class FirstNonRepeating {
    
    
        public static int firstNonRepeating(int arr[], int n) 
        { 
            HashSet<Integer> set = new HashSet<>();
            int[] temp = new int[n];
            for(int i=0;i<n;i++){
                temp[i] = arr[i];
            }
            Arrays.sort(temp);
            for(int i=0;i<n-1;i++){
                if(temp[i]==temp[i+1]){
                    set.add(temp[i]);
                }
            }
            for(int i=0;i<n;i++){
                if(!set.contains(arr[i])){
                    return arr[i];
                }
            }
            return 0;
        }  
        
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter Size of Array : ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Element for this Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

      System.out.println(firstNonRepeating(arr, size));  
    }
    
  
   
}

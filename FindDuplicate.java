import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class FindDuplicate {
    public static ArrayList<Integer> duplicates(int arr[], int n){
        ArrayList<Integer>result=new ArrayList<>();
        Arrays.sort(arr);
        int prev=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1] && prev!=arr[i]){
                result.add(arr[i]);
            }
        }

        if(result.size()==0){
            result.add(-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>result1=new ArrayList<>();
        int size;
        System.out.println("Enter Size of Array : ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Element for this Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        result1=duplicates(arr,size);
        for(int elem:result1){
            System.out.println(elem);
        }
    }
    
}

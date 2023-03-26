import java.util.Scanner;
import java.util.*;
public class KthSmallest {
     static int kthSmallest(int[] arr, int k) 
    { 
        //Your code here
        // Arrays.sort(arr);
        // return arr[k-1];


        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        for(int e:arr){
            pq.add(e);
        }
        for(int i=0;i<k-1;i++){
            pq.remove();
        }
        
        return pq.poll();
        
        
    } 

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         int size;
        System.out.println("Enter Size of Array : ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " Element for this Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k;
        System.out.println("Enter k : ");

        k=sc.nextInt();


        int result=kthSmallest(arr,k);
        System.out.println(result);
    }
}

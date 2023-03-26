import java.util.Collections;
import java.util.Scanner;
public class PeakElement {
    public static int peakElement(int[] arr,int n)
    {
       //add code here.
       int max=Integer.MIN_VALUE;
       int index=0;
       for(int i=0;i<n;i++){
           if(arr[i]>max){
               max=arr[i];
               index=i;
               
           }
       }
       
       return index;
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

        System.out.println(peakElement(arr,size));
        // for(int elem:result1){
        //     System.out.println(elem);
        // }
    }
}

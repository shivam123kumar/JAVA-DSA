import java.util.Scanner;

public class BitonicPoint {
    // Brute Force Approach
    static int findMaximumB(int[] arr, int n) {
        int big = -100000;
        for (int i = 0; i < n; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        return big;
    }

    // Optimize Approach
    static int findMaximumO(int[] arr, int n) {
        int s=0;
        int e=n-1;
        int mid=(s+e)/2;
        
        while(s<=e){
             if(arr[mid]>arr[mid-1]){
                if((mid+1)>e){
                    return arr[mid];
                }
                 else if(arr[mid]<arr[mid+1]){
                     s=mid+1;
                }
                else{
                    return arr[mid];
                }
             }
             else{
                e= mid-1;
             }
              mid=(s+e)/2;
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

        int result=findMaximumB(arr,size);
        System.out.println(result);
        int result2=findMaximumO(arr,size);
        System.out.println(result2);
    }
}
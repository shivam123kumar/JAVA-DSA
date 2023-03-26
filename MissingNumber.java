import java.util.Scanner;

public class MissingNumber {
    static int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum=n*(n+1)/2;
        int realSum=0;
        for(int i=0;i<array.length;i++){
            realSum+=array[i];
        }
        
        return sum-realSum;
        
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
       System.out.println(MissingNumber(arr,size)); 
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]);
        // }
        
    }
}

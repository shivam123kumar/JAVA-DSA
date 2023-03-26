import java.util.Scanner;
public class PrintallSubarray {
    static void PrintallSubarray(int[] a,int n){
      for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            for (int k = i; k <=j; k++){
            System.out.print(a[k] + " ");
            System.out.println("");
            }
        }
      }
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
        PrintallSubarray(arr,size);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        // }
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class Sort01 {
    public static void sort012(int a[], int n)
    {
        Arrays.sort(a);
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
        sort012(arr,size);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

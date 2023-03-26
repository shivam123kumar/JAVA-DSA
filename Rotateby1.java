import java.util.Scanner;
public class Rotateby1 {
    public static void rotate(int arr[], int n)
    {
        for(int i=0;i<n;i++){
              int temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;

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
        rotate(arr,size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
        
    }
}

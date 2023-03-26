import java.util.Scanner;
public class Findfrequency {
    static int findFrequency(int A[], int x){
        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(A[i]==x){
                count++;
            }
        }
        return count;
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
        int data;
        data=sc.nextInt();
        int result=findFrequency(arr,data);
        System.out.println(result);

    }
}

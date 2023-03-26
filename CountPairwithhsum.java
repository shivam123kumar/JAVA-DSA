import java.util.Scanner;
public class CountPairwithhsum {
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
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
        System.out.println("Enter Sum : ");
        int k;
        k=sc.nextInt();
        System.out.println(getPairsCount(arr, size,k));
}
}


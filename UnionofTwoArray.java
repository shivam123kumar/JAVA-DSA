import java.util.HashSet;
import java.util.Scanner;
public class UnionofTwoArray {
    public static int doUnion(int a[], int b[]) 
    {
  
        HashSet<Integer>set=new HashSet<>();
        for(int elem:a){
            set.add(elem);
        }
        for(int elem:b){
            set.add(elem);
        }
        
        return set.size();
        
        
        
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
        System.out.println("Enter Size of Another Array : ");
        size = sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter " + size + " Element for this Array : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println(doUnion(arr, arr1) );

    }
}

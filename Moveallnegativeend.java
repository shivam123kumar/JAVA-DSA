import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Collection;
public class Moveallnegativeend {
    public static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                a.add(arr[i]);
            }
        }
        
         for(int i=0;i<n;i++){
            if(arr[i]<0){
                a.add(arr[i]);
            }
        }
        
         for(int i=0;i<a.size();i++){

            arr[i]=a.get(i);

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
        segregateElements(arr, size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    } 
}

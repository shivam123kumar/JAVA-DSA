import java.util.Scanner;
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

public class MaxandMin {
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min=Long. MAX_VALUE;
        long max=Long. MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        
        return new pair(min,max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         long size;
        System.out.println("Enter Size of Array : ");
        size = sc.nextLong();
        long arr[] = new long[(int) size];
        System.out.println("Enter " + size + " Element for this Array : ");
        for (long i = 0; i < arr.length; i++) {
            arr[(int) i] = sc.nextInt();
        }
        pair product=getMinMax(arr, size);
        System.out.println(product.first+" "+product.second);
    }
}

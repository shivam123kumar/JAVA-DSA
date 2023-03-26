import java.util.Scanner;

public class ReverseArray {
    public static String reverseWord(String str)
    {
        String reverseArray="";
        for(int i=str.length()-1;i>=0;i--){
            reverseArray=reverseArray+str.charAt(i);
        }
       return reverseArray;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
       System.out.println(reverseWord(s));
    }
}

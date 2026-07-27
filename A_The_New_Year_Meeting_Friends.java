import java.util.*;

public class A_The_New_Year_Meeting_Friends{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        int sum = (arr[1]-arr[0]) + (arr[2]-arr[1]); 
        System.out.println(sum);
    }
}
import java.util.*;

public class A_Arrival_of_the_General{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int l =0,r=0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            if(arr[i]<=min){
                min=arr[i];
                r=i;
            }
            if(arr[i]>max){
                max=arr[i];
                l=i;
            }
        }
        int result = l+(n-r-1);
        if(l>r){
            System.out.println(result-1);
        }
        else System.out.println(result);
    }
}
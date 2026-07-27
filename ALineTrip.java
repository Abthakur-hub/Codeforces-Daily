import java.util.*;

public class ALineTrip{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[a];
            for(int i=0; i<a; i++) arr[i]=sc.nextInt();
            int max = Integer.MIN_VALUE;
            max = Math.max(max,arr[0]);
            for(int i=1; i<a; i++){
                max = Math.max(max, arr[i]-arr[i-1]);
            }
            max = Math.max(2*(k-arr[a-1]), max);
            System.out.println(max);

        }
    }
}
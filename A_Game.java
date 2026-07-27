import java.util.*;

public class A_Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int a = n/2;
        if(n%2==0)System.out.println(arr[a-1]);
        else System.out.println(arr[a]);

    }
}
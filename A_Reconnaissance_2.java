import java.util.*;

public class A_Reconnaissance_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        for(int i=0; i<n; i++){
            int j = (i+1)%(n);
            int c = Math.abs(arr[i] - arr[j]);
            if(c < min){
                min = c;
                a = i+1;
                b = j+1;
            }
        }
        System.out.println(a +" "+ b);
    }
} 
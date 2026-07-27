import java.util.*;

public class B_The_67_th_6_7_Integer_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int[] arr = new int[7];
            int sum = 0,max = Integer.MIN_VALUE;
            for(int i=0; i<7;i++){
                arr[i]=sc.nextInt();
                sum = sum - arr[i];
                max = Math.max(max,arr[i]);
            }
            sum+=2*max;
            System.out.println(sum);
        }
    }
}
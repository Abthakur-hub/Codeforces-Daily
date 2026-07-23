import java.util.*;

public class AXAxis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            int[] arr = new int[3];

            for(int i=0; i<3; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int m = arr[1];
            int ans = Math.abs(arr[0] - m)+ Math.abs(arr[1] - m)+ Math.abs(arr[2] - m);

            System.out.println(ans);
        }
    }
}
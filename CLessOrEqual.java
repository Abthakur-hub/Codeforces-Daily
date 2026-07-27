import java.util.*;

public class CLessOrEqual{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] v = new int[n];
        for(int i=0; i<n; i++){
            v[i] = sc.nextInt();
        }

        Arrays.sort(v);

        if(k == 0){
            if(v[0] == 1){
                System.out.println(-1);
            } else {
                System.out.println(v[0] - 1);
            }
        }
        else{
            int x = v[k - 1];

            if(k < n && v[k] == x){
                System.out.println(-1);
            } else {
                System.out.println(x);
            }
        }
    }
}
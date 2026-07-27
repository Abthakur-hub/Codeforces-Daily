import java.util.*;

public class BPleasantPairs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[2 * n + 1];
            for(int i=1; i<=n; i++){
                int x = sc.nextInt();
                arr[x] = i;
            }
            long ans = 0;
            for(int i=1; i<=2*n; i++){
                if(arr[i] == 0)
                    continue;
                for(int j=i+1; i*j<=2*n; j++){
                    if(arr[j] == 0)
                        continue;
                    if(arr[i] + arr[j] == i * j)
                        ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
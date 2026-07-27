import java.util.*;

public class BProgressiveSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int m = n * n;
            int[] b = new int[m];
            for(int i=0; i<m; i++)
                b[i] = sc.nextInt();
            Arrays.sort(b);
            int[] a = new int[m];
            int x = b[0];
            int k = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    a[k++] = x + i * c + j * d;
                }
            }
            Arrays.sort(a);
            System.out.println(Arrays.equals(a, b) ? "YES" : "NO");
        }
    }
}
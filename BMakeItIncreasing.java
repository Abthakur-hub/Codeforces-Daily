import java.util.*;

public class BMakeItIncreasing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            long b = 0;
            boolean flag = true;

            for(int i=n-2; i>=0; i--){
                while(a[i] >= a[i + 1]){
                    if(a[i] == 0){
                        flag = false;
                        break;
                    }
                    a[i] /= 2;
                    b++;
                }
                if(!flag){
                    break;
                }
            }

            System.out.println(flag ? b : -1);
        }
    }
}
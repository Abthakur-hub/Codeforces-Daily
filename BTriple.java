import java.util.*;

public class BTriple {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int h = a[0], c = 1, ans = -1;
            for(int i=1; i<n; i++){
                if(a[i] == h) c++;
                else{
                    h = a[i];
                    c = 1;
                }
                if(c == 3){
                    ans = h;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
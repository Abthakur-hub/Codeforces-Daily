import java.util.*;

public class BSortTheArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(b);
        int l = -1, r = -1;
        for(int i=0; i<n; i++){
            if(a[i] != b[i]){
                if(l == -1)
                    l = i;
                r = i;
            }
        }
        if(l == -1){
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }
        int i = l, j = r;
        while(i < j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
        boolean flag = true;
        for(i = 0; i < n; i++){
            if(a[i] != b[i]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("yes");
            System.out.println((l + 1) + " " + (r + 1));
        }
        else{
            System.out.println("no");
        }
    }
}
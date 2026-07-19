import java.util.*;

public class BGiftsFixing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            int t = sc.nextInt();
            int[] a = new int[t];
            int[] b = new int[t];
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;
            for(int i=0; i<t; i++){
                a[i]=sc.nextInt();
                min1 = Math.min(a[i],min1);
            }
            for(int i=0; i<t; i++){
                b[i]=sc.nextInt();
                min2 = Math.min(b[i],min2);
            }
            long count = 0;
            for(int i=0; i<t; i++){
                count+=Math.max(a[i]-min1 ,b[i]-min2);
            }
            System.out.println(count);
        }
    }
}
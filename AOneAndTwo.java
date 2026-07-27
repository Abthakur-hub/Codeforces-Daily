import java.util.*;

public class AOneAndTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), tw = 0;
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                if(a[i] == 2) tw++;
            }

            if(tw % 2 == 1){
                System.out.println(-1);
                continue;
            }

            if(tw == 0){
                System.out.println(1);
                continue;
            }
            int c = 0;
            for(int i=0; i<n; i++){
                if(a[i] == 2) c++;

                if(c == tw / 2){
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
import java.util.*;

public class BNoCasinoInTheMountains{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[a];
            for(int i= 0; i<a; i++) arr[i]=sc.nextInt();

            
            int peak = 0;
            int count = 0;

            for(int i=0; i<a; i++){
                if(arr[i]==0){
                    count++;
                    if(count==k){
                        peak++;
                        count = 0;
                        i++;
                    }
                }
                else count = 0;
            }
            System.out.println(peak);
        }
    }
}
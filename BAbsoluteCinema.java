import java.util.*;

public class BAbsoluteCinema{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int[] arr1 = new int[a];
            int[] arr2 = new int[a];
            int max = 0;
            for(int i=0; i<a; i++){
                arr1[i] = sc.nextInt();
            }
            for(int i=0; i<a; i++){
                arr2[i] = sc.nextInt();
            }
            long sum = 0;
            for(int i=0; i<a; i++) {
                if(arr1[i]>arr2[i]){
                    int temp = arr1[i];
                    arr1[i] = arr2[i];
                    arr2[i] = temp;
                }
                sum+=arr2[i];
            }
            for(int i=0 ; i<a; i++){
                max=Math.max(max,arr1[i]);
            }
            System.out.println(sum+max);
        }
    }
}
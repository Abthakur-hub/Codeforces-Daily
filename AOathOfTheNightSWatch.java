import java.util.*;

public class AOathOfTheNightSWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : arr){
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        int count = 0;

        for(int x : arr){
            if(x > min && x < max){
                count++;
            }
        }

        System.out.println(count);
    }
}
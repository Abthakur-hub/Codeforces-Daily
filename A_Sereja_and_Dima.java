import java.util.*;

public class A_Sereja_and_Dima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = 0, d = 0;
        int a = 0, b = n - 1;
        int count = 0;

        while(a <= b) {
            if(arr[a] > arr[b]) {
                if(count % 2 == 0) s += arr[a];
                else d += arr[a];
                a++;
            } else {
                if(count % 2 == 0) s += arr[b];
                else d += arr[b];
                b--;
            }
            count++;
        }

        System.out.println(s + " " + d);
    }
}
import java.util.*;

public class BAlternatingSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {

                if (i % 2 == 0)
                    arr[i]= -1;
                else
                    arr[i]= 3;
            }
            if(n%2==0){
                arr[n-1]=2;
            }
            for(int i=0; i<n; i++) System.out.print(arr[i]+" ");

            System.out.println();
        }

    }
}
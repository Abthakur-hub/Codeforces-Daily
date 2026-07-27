import java.util.*;

public class A_Restoring_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;

        int[] arr = new int[4];
        for(int i = 0; i < 4; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max) max = arr[i];
        }

        for(int i=0; i<4; i++){
            if(arr[i]!=max){
                System.out.print(max-arr[i] +" ");
            }
        }

    }
}
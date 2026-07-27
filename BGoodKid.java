import java.util.*;

public class BGoodKid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0){
            int a = sc.nextInt();
            int[] arr = new int[a];
            int min = Integer.MAX_VALUE;
            int product = 1;


            for(int i= 0; i<a; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);

            int b = arr[0];
            arr[0] = b+1;
            for(int i=0; i<a; i++){
                product*=arr[i];
            }
            System.out.println(product);
            
        }
    }
}
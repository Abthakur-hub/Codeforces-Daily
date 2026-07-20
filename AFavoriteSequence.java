import java.util.*;

public class AFavoriteSequence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int[] b = new int[n];
            for(int i=0; i<n; i++){
                b[i] = sc.nextInt();
            }

            int l=0, r=n-1;

            for(int i=0; i<n; i++){
                if(i%2 == 0){
                    System.out.print(b[l++] + " ");
                }
                else{
                    System.out.print(b[r--] + " ");
                }
            }
            System.out.println();
        }
    }
}

import java.util.*;

public class AOnlyPluses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-- > 0){
            int[] arr = new int[3];
            for(int i=0; i<3; i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<5; i++){
                Arrays.sort(arr);
                arr[0] = arr[0]+1;
            }
            int m=1;
            for(int i=0; i<3; i++){
                m = m * arr[i];
            }
            System.out.println(m);
        }
        
    }
}
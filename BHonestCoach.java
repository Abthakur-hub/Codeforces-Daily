import java.util.*;

public class BHonestCoach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int[] arr = new int[a];
            for(int i=0; i<a; i++)arr[i]=sc.nextInt();

            int min = Integer.MAX_VALUE;
            for(int i=0; i<a; i++){
                for(int j=0; j<a; j++){
                    if(i!=j){
                        min = Math.min(Math.abs(arr[i]-arr[j]),min);
                    }
                }
            }
            System.out.println(min);
        }
    }
}
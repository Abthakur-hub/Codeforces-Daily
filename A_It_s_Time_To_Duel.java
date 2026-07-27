import java.util.*;

public class A_It_s_Time_To_Duel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int[] arr = new int[a];
            int b = 0;
            for(int i=0; i<a; i++){
                arr[i]=sc.nextInt();
                if(i>0){
                    if(arr[i]==arr[i-1]) {
                        b = 1;
                        break;
                    }
                }
            }
            System.out.println(b==0?"NO":"YES");
        }
    }
}
import java.util.*;

public class A_Marathon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int[] arr = new int[4];
            int s = 0;
            for(int i=0; i<4; i++) arr[i]=sc.nextInt();
            for(int i=1; i<4; i++){
                if(arr[i]>arr[0]) s++;
            }
            System.out.println(s);  
        }
        
    }
}
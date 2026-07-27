import java.util.*;

public class A_New_Year_and_Hurry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        
        int left = 240 - k;
        int Used = 0;
        int count = 0;
        
        for(int i = 1; i <= n; i++){
            Used += 5 * i;
            if(Used > left) break;
            count++;
        }
        
        System.out.println(count);
    }
}
import java.util.*;

public class CTheLegendOfFreyaTheFrog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long a = (x + k - 1) / k; 
            long b = (y + k - 1) / k; 
            if(a>b){
                System.out.println(2 * a - 1);
            }
            else{
                System.out.println(2 * b);
            }
        }
    }
}
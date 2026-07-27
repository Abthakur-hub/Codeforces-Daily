import java.util.*;

public class ALawnMower{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            long n = sc.nextLong();
            long w = sc.nextLong();
            long full = n/w;
            long rem = n%w;
            long ans = full*(w-1)+rem;
            System.out.println(ans);
        }
    }
}
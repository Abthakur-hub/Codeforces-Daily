import java.util.*;

public class AUniformString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++){
                sb.append((char)('a'+(i%k)));
            }
            System.out.println(sb);
        }
    }
}
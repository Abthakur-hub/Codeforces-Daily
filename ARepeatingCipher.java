import java.util.*;

public class ARepeatingCipher{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        int i = 0, step = 1;
        while(i<n){
            ans.append(s.charAt(i));
            i += step;
            step++;
        }
        System.out.println(ans);
    }

}
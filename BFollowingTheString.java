import java.util.*;

public class BFollowingTheString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            int[] cnt = new int[26];
            char[] ans = new char[n];
            for(int i=0; i<n; i++){
                for(int j=0; j<26; j++){
                    if(cnt[j] == a[i]){
                        ans[i] = (char)('a' + j);
                        cnt[j]++;
                        break;
                    }
                }
            }
            System.out.println(new String(ans));
        }
    }
}
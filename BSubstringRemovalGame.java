import java.util.*;

public class BSubstringRemovalGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            ArrayList<Integer> a = new ArrayList<>();
            int c = 0;
            for(char ch : s.toCharArray()){
                if(ch == '1'){
                    c++;
                }
                else{
                    if(c > 0) a.add(c);
                    c = 0;
                }
            }
            if(c>0) a.add(c);
            Collections.sort(a, Collections.reverseOrder());
            int ans = 0;
            for(int i=0; i<a.size(); i+=2)
                ans += a.get(i);
            System.out.println(ans);
        }
    }
}
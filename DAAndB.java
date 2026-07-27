import java.util.*;

public class DAAndB{
    static long calc(String s, char ch){
        ArrayList<Long> p = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ch)
                p.add((long)i);
        }

        int m = p.size();

        if(m <= 1) return 0;

        long[] v = new long[m];

        for(int i=0; i<m; i++)
            v[i] = p.get(i) - i;

        long med = v[m / 2];
        long res = 0;

        for(int i=0; i<m; i++)
            res += Math.abs(v[i] - med);

        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            long a = calc(s, 'a');
            long b = calc(s, 'b');

            System.out.println(Math.min(a, b));
        }
    }
}
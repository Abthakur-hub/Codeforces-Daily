import java.util.*;

public class CChipmunkTheoAndEquality{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer,Integer> fr = new HashMap<>();
            HashMap<Integer,Long> co = new HashMap<>();
            for(int x : arr) {
                HashSet<Integer> v = new HashSet<>();
                int cr = x;
                int s = 0;
                while(!v.contains(cr)) {
                    v.add(cr);
                    fr.put(cr,fr.getOrDefault(cr,0)+1);
                    co.put(cr,co.getOrDefault(cr,0L)+s);
                    if (cr%2==0) {
                        cr/=2;
                    } else {
                        cr+=1;
                    }
                    s++;
                }
            }
            long ans = Long.MAX_VALUE;
            for(int x : fr.keySet()) {
                if(fr.get(x)==n) {
                    ans = Math.min(ans,co.get(x));
                }
            }
            System.out.println(ans);
        }
    }
}
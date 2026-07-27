import java.util.*;

public class CPowersOfTwo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        if(k < Integer.bitCount(n) || k > n){
            System.out.println("NO");
            return;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<31; i++)
            if((n & (1 << i)) != 0)
                pq.add(1 << i);

        while(pq.size() < k){
            int x = pq.poll();
            pq.add(x / 2);
            pq.add(x / 2);
        }
        System.out.println("YES");
        while(!pq.isEmpty())
            System.out.print(pq.poll() + " ");
    }
}
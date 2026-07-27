import java.util.*;

public class CGoodArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            sum += a[i];
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            long temp = sum - a[i];
            if(temp%2==0){
                temp /= 2;
                map.put(a[i], map.get(a[i]) - 1);
                if(map.getOrDefault(temp, 0)>0){
                    ans.add(i + 1);
                }
                map.put(a[i], map.get(a[i]) + 1);
            }
        }
        System.out.println(ans.size());
        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}
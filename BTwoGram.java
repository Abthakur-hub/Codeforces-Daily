import java.util.*;

public class BTwoGram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        HashMap<String, Integer> m = new HashMap<>();

        for(int i=0; i<n - 1; i++){
            String t = s.substring(i, i + 2);
            m.put(t, m.getOrDefault(t, 0) + 1);
        }

        int mx = 0;
        String ans = "";

        for(Map.Entry<String, Integer> e : m.entrySet()){
            if(e.getValue() > mx){
                mx = e.getValue();
                ans = e.getKey();
            }
        }

        System.out.println(ans);
    }
}
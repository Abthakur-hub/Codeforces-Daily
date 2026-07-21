import java.util.HashMap;
import java.util.Scanner;

public class AProblemGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int m = sc.nextInt();
            HashMap<Character , Integer> freq = new HashMap<>();

            String s = sc.next();
            for(char c: s.toCharArray()){
                freq.put(c , freq.getOrDefault(c,0)+1);
            }
            int count = 0;
            for(char c :freq.keySet()){
                int b = freq.get(c);
                if(b<m){
                    count+=m-b;
                }
            }
            if(freq.size()<7){
                count = count + (7 - freq.size())*m;
            }
            System.out.println(count);
        }
    }
}